package com.example.task_tmdb.ui.screens.top

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.task_tmdb.R
import com.example.task_tmdb.app.model.ResultsItem
import com.example.task_tmdb.app.repository.Repository
import com.example.task_tmdb.ui.adapters.MovieRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class TopMovieFragment : Fragment() {

    private lateinit var viewModel: TopViewModel
    private var movieAdapter: MovieRecyclerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        val repository = Repository()
        val viewModelFactory = TopViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)[TopViewModel::class.java]
        viewModel.getMoviewCustomModel()
        viewModel.repoCustom.observe(viewLifecycleOwner) { response ->
            response.results?.let {
                movieAdapter?.setList(response.results as List<ResultsItem>)
            }
        }
    }

    private fun initAdapter() {
        movieAdapter = MovieRecyclerAdapter()
        rvMovie.apply {
            adapter = movieAdapter
            layoutManager = GridLayoutManager(activity, 2)
        }
    }
}
package com.example.task_tmdb.app.model.details

import com.google.gson.annotations.SerializedName

data class ResponseDetails(
	@field:SerializedName("original_language")
	val originalLanguage: String? = null,
	val imdbId: String? = null,
	val video: Boolean? = null,
	val title: String? = null,
	@field:SerializedName("backdrop_path")
	val backdropPath: String? = null,
	val revenue: Int? = null,
	val genres: List<GenresItem?>? = null,
	val popularity: Any? = null,
	val productionCountries: List<ProductionCountriesItem?>? = null,
	val id: Int? = null,
	val voteCount: Int? = null,
	val budget: Int? = null,
	val overview: String? = null,
	val originalTitle: String? = null,
	val runtime: Int? = null,
	@field:SerializedName("poster_path")
	val posterPath: String? = null,
	val spokenLanguages: List<SpokenLanguagesItem?>? = null,
	val productionCompanies: List<ProductionCompaniesItem?>? = null,
	@field:SerializedName("release_date")
	val releaseDate: String? = null,
	@field:SerializedName("vote_average")
	val voteAverage: Any? = null,
	val belongsToCollection: BelongsToCollection? = null,
	val tagline: String? = null,
	val adult: Boolean? = null,
	val homepage: String? = null,
	val status: String? = null
)

package app.data.remote

import app.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {

    @GET("categories.php")
    suspend fun getMeals(): CategoryResponse

}
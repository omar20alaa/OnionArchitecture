package app.onion_architecture.di

import app.data.remote.ApiService
import app.data.repo.MealsRepositoryImp
import app.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo {
        return MealsRepositoryImp(apiService)
    }

}
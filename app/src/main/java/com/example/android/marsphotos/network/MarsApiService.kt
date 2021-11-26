package com.example.android.marsphotos.network



    private const val BASE_URL =
        "https://android-kotlin-fun-mars-server.appspot.com"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
    interface MarsApiService {
        @GET("photos")
        suspend fun getPhotos(): String

        object MarsApi {
            val retrofitService : MarsApiService by lazy {
                retrofit.create(MarsApiService::class.java) }
            }

        }




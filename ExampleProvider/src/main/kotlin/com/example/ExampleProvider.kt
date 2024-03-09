package com.yoshi

import androidx.appcompat.app.AppCompatActivity
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.LoadResponse.Companion.addActors

class ExampleProvider(val plugin: TestPlugin) : MainAPI() { // all providers must be an intstance of MainAPI
    override var mainUrl = "https://calciostreaming.lol"
    override var name = "Example sex provide"
    override val supportedTypes = setOf(TvType.Live)

    override var lang = "it"

    // enable this when your provider has a main page
    override val hasMainPage = true

    override val mainPage = mainPageOf(
        "${mainUrl}/#collapseSerieA"           to "Recently Featured"
    )
    // this function gets called when you search for something


    override suspend fun search(query: String): List<SearchResponse> {
        return listOf<SearchResponse>()
    }
}
package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        fun displayTwitter() {
            var twitter = twitter("Mitchell", "@mit", "I love coding", "", "", "", "")
            var twitter1 = twitter("Jon", "@jon", "I love travelling", "", "", "", "")
            var twitter2 = twitter("Cheko", "@cheko", "I love watching", "", "", "", "")
            var twitter3 = twitter("Dennis", "@den", "I love reading", "", "", "", "")
            var twitter4 = twitter("Justa", "@justa", "I love helping", "", "", "", "")
            var twitter5 = twitter("Ivy", "@ivy", "I love laughing", "", "", "", "")
            var twitter6 = twitter("Isaac", "@isaac", "I love dancing", "", "", "", "")
            var twitter7 = twitter("Imelda", "@im", "I am hardworking", "", "", "", "")
            var twitter8 = twitter("Kelvin", "@kel", "I like partying", "", "", "", "")
            var twitter9 = twitter("James", "@jm", "I love Python", "", "", "", "")
            var twitter10 = twitter("Mark", "@mrk", "I love travelling", "", "", "", "")
            var twitter11 = twitter("Joanna", "@jn", "I love doing makeup", "", "", "", "")
            var twitter12 = twitter("Abigael", "@ab", "I love eating", "", "", "", "")
            var twitter13 = twitter("Ohesto", "@oh", "I love cooking", "", "", "", "")


            var twitterList = listOf(
                twitter,
                twitter2,
                twitter3,
                twitter4,
                twitter5,
                twitter6,
                twitter7,
                twitter8,
                twitter9,
                twitter10,
                twitter11,
                twitter12,
                twitter13
            )
            var twitterAdapter = twitterRvAdapter(twitterList)
            binding.rvtwitter.layoutManager = LinearLayoutManager(this)
            binding.rvtwitter.adapter = twitterAdapter

        }
    }
}
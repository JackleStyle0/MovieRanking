# MovieRanking

### Dependencies
    // Navigation
    def navVersion = "2.5.3"
    implementation "androidx.navigation:navigation-fragment-ktx:$navVersion"
    implementation "androidx.navigation:navigation-ui-ktx:$navVersion"

    // Architecture component
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")

    // connect api
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation "com.squareup.okhttp3:okhttp:4.9.3"
    implementation "com.squareup.okhttp3:logging-interceptor:4.9.3"

    // image loader Glide
    implementation 'com.github.bumptech.glide:glide:4.15.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.15.0'

    // Unit test
    def mockkVersion = "1.13.4"
    testImplementation "io.mockk:mockk-android:${mockkVersion}"
    testImplementation "io.mockk:mockk-agent:${mockkVersion}"
    testImplementation "androidx.arch.core:core-testing:2.2.0"

    //Coroutines
    def coroutineVersion = "1.6.4"
    testImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutineVersion"
    
 ### mock data
  ```kotlin private fun createMockData(): List<Movie> {
        return listOf(
            Movie(
                "Avatar",
                "2009",
                "$2,923,706,026",
                "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
                "https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
                1
            ),
            Movie(
                "Avengers: Endgame",
                "2019",
                "$2,799,439,100",
                "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_FMjpg_UX1000_.jpg",
                2
            ),
            Movie(
                "Avatar: The Way of Water",
                "2022",
                "$2,250,471,788",
                "Jake Sully lives with his newfound family formed on the extrasolar moon Pandora. Once a familiar threat returns to finish what was previously started, Jake must work with Neytiri and the army of the Na'vi race to protect their home.",
                "https://m.media-amazon.com/images/M/MV5BYjhiNjBlODctY2ZiOC00YjVlLWFlNzAtNTVhNzM1YjI1NzMxXkEyXkFqcGdeQXVyMjQxNTE1MDA@._V1_FMjpg_UX1000_.jpg",
                3
            ),
            Movie(
                "Titanic",
                "1997",
                "$2,247,531,869",
                "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
                "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_.jpg",
                4
            ),
            Movie(
                "Star Wars: Episode VII - The Force Awakens",
                "2015",
                "$2,247,531,869",
                "As a new threat to the galaxy rises, Rey, a desert scavenger, and Finn, an ex-stormtrooper, must join Han Solo and Chewbacca to search for the one hope of restoring peace.",
                "https://m.media-amazon.com/images/M/MV5BOTAzODEzNDAzMl5BMl5BanBnXkFtZTgwMDU1MTgzNzE@._V1_.jpg",
                5
            ),
            Movie(
                "Avengers: Infinity War",
                "2018",
                "$2,052,415,039",
                "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
                "https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_.jpg",
                6
            ),
            Movie(
                "Spider-Man: No Way Home",
                "2021",
                "$1,921,847,111",
                "With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.",
                "https://m.media-amazon.com/images/M/MV5BOGRkMDgwMjMtZmFkZi00NjEwLTllMDktMDcxZmQxYmYwNTVlXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg",
                7
            ),
            Movie(
                "Jurassic World",
                "2021",
                "$1,671,537,444",
                "A new theme park, built on the original site of Jurassic Park, creates a genetically modified hybrid dinosaur, the Indominus Rex, which escapes containment and goes on a killing spree.",
                "https://m.media-amazon.com/images/M/MV5BNzQ3OTY4NjAtNzM5OS00N2ZhLWJlOWUtYzYwZjNmOWRiMzcyXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg",
                8
            ),
            Movie(
                "The Lion King",
                "2019",
                "$1,663,075,401",
                "After the murder of his father, a young lion prince flees his kingdom only to learn the true meaning of responsibility and bravery.",
                "https://m.media-amazon.com/images/M/MV5BNGQ4ZjhjOGEtMWY4Ny00OThjLWI0MWEtMDA3NzU2ZGE0OWZlXkEyXkFqcGdeQXVyMzQ4MDAzOTE@._V1_.jpg",
                9
            ),
            Movie(
                "The Avengers",
                "2012",
                "$1,520,538,536",
                "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
                "https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
                10
            ),
        )
    }
    ```

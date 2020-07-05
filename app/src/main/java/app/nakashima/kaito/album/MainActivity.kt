package app.nakashima.kaito.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preview.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preview = Intent(this, PreviewActivity::class.java)


        albumImage1.setOnClickListener {


            preview.putExtra("image", R.drawable.sea_image)

            preview.putExtra("title", "海の写真だす－－－－－！")

            startActivity(preview)
        }


        albumImage2.setOnClickListener {


            preview.putExtra("image", R.drawable.cat_image)

            preview.putExtra("title", "猫ちゃんの写真だす")

            startActivity(preview)

            albumImage3.setOnClickListener {


                preview.putExtra("image", R.drawable.dog_image)

                preview.putExtra("title", "ワンちゃんの写真だす")

                startActivity(preview)

            }

            albumImage4.setOnClickListener {


                preview.putExtra("image", R.drawable.cake_image)

                preview.putExtra("title", "ケーキの写真だす")

                startActivity(preview)

            }

            albumImage5.setOnClickListener {


                preview.putExtra("image", R.drawable.night_image)

                preview.putExtra("title", "夜の街の写真だす")

                startActivity(preview)

            }
        }


    }

}
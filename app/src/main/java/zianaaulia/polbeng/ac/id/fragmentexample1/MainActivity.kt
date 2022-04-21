package zianaaulia.polbeng.ac.id.fragmentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Coordinator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onBookChanged(index:Int) {
        val frag = fragmentbookdescription
        if (frag is BookDescription){
            frag.changeDescription(index)
        }
    }
}
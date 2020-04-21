package kun.hee.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kun.hee.sharedpreferences.Utils.ContextUtil

class MainActivity : BaseActivity() {
    override fun setupEvents() {
        TODO("Not yet implemented")
    }

    override fun setValues() {

        //        class자체가 변수로 받을 수 있다.
        ContextUtil.prefName

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

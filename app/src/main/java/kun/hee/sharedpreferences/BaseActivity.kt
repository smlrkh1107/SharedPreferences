package kun.hee.sharedpreferences

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity(){
    lateinit var mContext : Context //Adapter에 더 적절,
    // this를 바로 안쓰는 이유는 실행전에 초기화되면 불안해서?
    abstract fun setupEvents()
    abstract fun setValues()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        mContext = this

        }


}
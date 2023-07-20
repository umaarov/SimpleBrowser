package uz.umarov.browser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.umarov.browser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goButton.setOnClickListener {
            val url = binding.urlEditText.text.toString()
            binding.webView.loadUrl(url )
        }

    }
}
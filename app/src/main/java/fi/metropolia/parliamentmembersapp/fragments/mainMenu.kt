package fi.metropolia.parliamentmembersapp.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.squareup.picasso.Picasso
import fi.metropolia.parliamentmembersapp.R

import fi.metropolia.parliamentmembersapp.databinding.FragmentMainMenuBinding

class mainMenu : Fragment() {
    private lateinit var binding : FragmentMainMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentMainMenuBinding>(inflater, R.layout.fragment_main_menu,container,false)

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Logo_of_the_Parliament_of_Finland.svg/2880px-Logo_of_the_Parliament_of_Finland.svg.png").into(binding.imageView)


        return binding.root
    }
}
package fi.metropolia.parliamentmembersapp.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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

        //Using picasso to load image from the internet for parliament logo
        val IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Logo_of_the_Parliament_of_Finland.svg/2880px-Logo_of_the_Parliament_of_Finland.svg.png"
        Picasso.get().load(IMAGE_URL).into(binding.imageView)

        //Adding functionality for buttons
        binding.btnByParties.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenu_to_partyList)
        }
        binding.btnAllMembers.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenu_to_membersList)
        }

        return binding.root
    }
}
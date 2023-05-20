package com.example.intermediateproject.ui.onboarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.intermedia.intermedia.R
import com.intermedia.intermedia.databinding.FragmentOnboardingBinding
import com.intermedia.intermedia.ui.onboarding.DepthPageTransformer
import com.intermedia.intermedia.ui.onboarding.OnboardingItem
import com.intermedia.intermedia.ui.onboarding.ViewPagerAdapter

class OnboardingFragment : Fragment(R.layout.fragment_onboarding) {

    private lateinit var ui: FragmentOnboardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ui = FragmentOnboardingBinding.bind(view)
        ui.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_to_mainActivity)

        }
        ui.viewPagerInter.setup()
    }

    private fun ViewPager2.setup() {
        setPageTransformer(DepthPageTransformer())
        adapter = ViewPagerAdapter(
            listOf(
                OnboardingItem(getString(R.string.onboarding_title_1)),
                OnboardingItem(getString(R.string.onboarding_title_2)),
                OnboardingItem(getString(R.string.onboarding_title_3))
            )
        )
    }
}

package com.example.crowdfunding.ui.cropinfofarmer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class CropInfoFragment extends Fragment {
    private RecyclerView recyclerview;
    private Button SellCropBtn;

    int[] image ={R.drawable.potato,R.drawable.tomato,R.drawable.onion,R.drawable.carrot,R.drawable.beans,R.drawable.brinjal,R.drawable.cucumber,R.drawable.raddish,R.drawable.spinach,R.drawable.coriender,R.drawable.beetroot,R.drawable.chillies,R.drawable.layds_finger};


    private String crop_name[];/*={"Potato","Tomato","Onion","Carrot","Beans","Brinjal","Cucumber","Raddish","Spinach","Coriander Leaves","BeetRoot","Chillies","Ladys Finger"};*/

    private String crop_description[];/*={"The Portuguese introduced potatoes, which they called 'Batata', to India in the early seventeenth century when they cultivated it along the western coast. British traders introduced potatoes to Bengal as a root crop, 'Alu'.",
            "Andhra Pradesh is the largest producer of tomatoes in India. Tomato is one of the major horticulture crop of the country. ... Around 11 % of the total world produce of tomatoes is cultivated in India.",
            "India is the second largest onion growing country in the world. Indian onions are famous for their pungency and are available round the year. Indian onions has two crop cycles.",
            "Carrots are a rich source of b-carotene and contain appreciable amounts of thiamine and riboflavin. The Carrot crop is the Second most popular vegetable in the world after potato.",
            "Dal is often translated as “lentils” but actually refers to a split version of a number of lentils, peas, chickpeas (chana), kidney beans and so on. If a pulse is split into half, it is a dal.",
            "Brinjal is grown on nearly 550,000 hectares in India, making the country the second largest producer after China with a 26% world production share. ",
            "Cucumbers are originated in India. It is a climbing plant which is used as summer vegetable throughout in India. The cucumber fruit is eaten raw or is served as a salad or cooked as a vegetable",
            "Daikon refers to a wide variety of winter oilseed radishes from Asia. While the Japanese name daikon has been adopted in English, it is also sometimes called the Japanese radish, Chinese radish, Oriental radish or mooli (in India and South Asia). ",
            "Spinach is a hot season leafy vegetable grown across all India, this can be grown in back yards as well as open fields commercially. Known for lush green foliage spinach is rich in iron, vitamins, and anti-oxidants.",
            "Coriander leaves have a strong odour. They also haveAromatic green leaves that are largely used to flavour and garnish food. Belonging to the same family of Cilantro, the leaves, dried seeds and powder are widely used in the Indian cuisine.",
            "In India Beetroot is mainly cultivated in Haryana, Uttar Pradesh, Himachal Pradesh, West Bengal and Maharashtra. The total cultivable areas of Beetroot in Tamil Nadu during 2014-15 were 1116 in hectares",
            "Chili pepper is a fruit used in Indian cuisines as a spice, introduced in India by the Portuguese and today India is one of the largest producer of green chili",
            "Ladies finger or Okra, which is also known as ' Bhindi ', is one of the important vegetable crops of India. It is grown throughout the tropical and sub-tropical regions and also in the warmer parts of the temperate regions. "};*/

    //int[] simage ={R.mipmap.logo_round};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_cropinfo_farmer, container, false);

        recyclerview =  (RecyclerView) root.findViewById(R.id.scheme_view);

        RecyclerView.LayoutManager layoutmanager=new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutmanager);
        crop_name=getActivity().getResources().getStringArray(R.array.crop_name_farmer);
       crop_description=getActivity().getResources().getStringArray(R.array.crop_description_farmer);

        CropInfoAdapter myadapter = new CropInfoAdapter(getActivity(),image,crop_name,crop_description);
        recyclerview.setAdapter(myadapter);
        SellCropBtn = (Button) root.findViewById(R.id.sell_crops);
        SellCropBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),SellCropActivity.class);
                startActivity(i);
            }
        });

        return root;
    }
}

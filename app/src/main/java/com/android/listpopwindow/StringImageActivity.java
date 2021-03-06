package com.android.listpopwindow;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.listpoplibrary.ListPopWindowManager;
import com.android.listpoplibrary.model.ImageType;
import com.android.listpoplibrary.model.ListPopModel;
import com.android.listpoplibrary.model.PopWindowType;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StringImageActivity extends AppCompatActivity {
    @BindView(R.id.btn_string_image_nobackground)
    Button btnStringImageNobackground;
    @BindView(R.id.btn_string_image_withbackground)
    Button btnStringImageWithbackground;
    @BindView(R.id.btn_string_image_nobackground_fillscreen)
    Button btnStringImageNobackgroundFillscreen;
    @BindView(R.id.btn_string_image_withbackground_fillscreen)
    Button btnStringImageWithbackgroundFillscreen;
    @BindView(R.id.btn_string_image_net)
    Button btnStringImageNet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_image);
        ButterKnife.bind(this);

    }
    @OnClick({R.id.btn_string_image_nobackground, R.id.btn_string_image_withbackground, R.id.btn_string_image_nobackground_fillscreen, R.id.btn_string_image_withbackground_fillscreen, R.id.btn_string_image_net})
    public void onViewClicked(View view) {
        final List<ListPopModel> list = new ArrayList<>();
        list.add(new ListPopModel("测试 1", R.drawable.shizi,  ImageType.Resources));
        list.add(new ListPopModel("测试 2", R.drawable.shizi, ImageType.Resources));
        list.add(new ListPopModel("测试 3", R.drawable.shizi,  ImageType.Resources));
        list.add(new ListPopModel("测试 4", R.drawable.shizi, ImageType.Resources));
        list.add(new ListPopModel("测试===== 5", R.drawable.shizi, ImageType.Resources));
        list.add(new ListPopModel("测试===== 6", R.drawable.shizi, ImageType.Resources));
        list.add(new ListPopModel("测试===== 7", R.drawable.shizi,  ImageType.Resources));
        list.add(new ListPopModel("测试===== 8", R.drawable.shizi,  ImageType.Resources));
        switch (view.getId()) {
            case R.id.btn_string_image_nobackground:
                ListPopWindowManager.getInstance().showStringImagePopWindow(PopWindowType.String_Image_Nobg,list, btnStringImageNobackground, this,
                        new ListPopWindowManager.onListPopItemClickListener() {
                            @Override
                            public void onClick(int position) {
                                Toast.makeText(StringImageActivity.this, list.get(position).getType()+"="+list.get(position).getContent(), Toast.LENGTH_SHORT).show();
                            }
                        });
                break;
            case R.id.btn_string_image_withbackground:
                ListPopWindowManager.getInstance().showStringImagePopWindow(PopWindowType.String_Image_Hasbg,list, btnStringImageWithbackground, this,
                        new ListPopWindowManager.onListPopItemClickListener() {
                            @Override
                            public void onClick(int position) {
                                Toast.makeText(StringImageActivity.this, list.get(position).getType()+"="+list.get(position).getContent(), Toast.LENGTH_SHORT).show();
                            }
                        });

                break;
            case R.id.btn_string_image_nobackground_fillscreen:
                ListPopWindowManager.getInstance().showStringImagePopWindow(PopWindowType.String_Image_Nobg_fill,list, btnStringImageNobackgroundFillscreen, this,
                        new ListPopWindowManager.onListPopItemClickListener() {
                            @Override
                            public void onClick(int position) {
                                Toast.makeText(StringImageActivity.this, list.get(position).getType()+"="+list.get(position).getContent(), Toast.LENGTH_SHORT).show();
                            }
                        });

                break;
            case R.id.btn_string_image_withbackground_fillscreen:
                ListPopWindowManager.getInstance().showStringImagePopWindow(PopWindowType.String_Image_Hasbg_fill,list, btnStringImageWithbackgroundFillscreen, this,new ListPopWindowManager.onListPopItemClickListener() {
                    @Override
                    public void onClick(int position) {
                        Toast.makeText(StringImageActivity.this, list.get(position).getType()+"="+list.get(position).getContent(), Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case R.id.btn_string_image_net:
                final List<ListPopModel> list_netImages = new ArrayList<>();
                list_netImages.add(new ListPopModel("测试 1",
                        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1510212565&di=6a65804488c5146bdde006f13bb983c5&imgtype=jpg&er=1&src=http%3A%2F%2Fff.topitme.com%2Ff%2F1a%2Ff4%2F1137312418ec4f41afm.jpg",
                        ImageType.Net));
                list_netImages.add(new ListPopModel("测试 2",
                        "http://old.bz55.com/uploads/allimg/140922/138-140922145121.jpg" ,
                        ImageType.Net));
                list_netImages.add(new ListPopModel("测试 3",
                        "http://old.bz55.com/uploads/allimg/140922/138-140922145121-50.jpg",
                        ImageType.Net));
                list_netImages.add(new ListPopModel("测试 4",
                        "http://old.bz55.com/uploads/allimg/140922/138-140922145122.jpg",
                        ImageType.Net));
                list_netImages.add(new ListPopModel("测试===== 5",
                        "http://old.bz55.com/uploads/allimg/140922/138-140922145119.jpg",
                        ImageType.Net));
                list_netImages.add(new ListPopModel("测试===== 6",
                        "http://old.bz55.com/uploads/allimg/140922/138-140922145120-50.jpg",
                        ImageType.Net));
                list_netImages.add(new ListPopModel("测试===== 7",
                        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1510212811&di=a4aebf282dcec8b70921b0bce08847ce&imgtype=jpg&er=1&src=http%3A%2F%2Ff2.topitme.com%2F2%2F2b%2Fcc%2F113731243120ccc2b2m.jpg",
                        ImageType.Net));
                list_netImages.add(new ListPopModel("测试===== 8",
                        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1509618093965&di=8e9d62f51db174daee4b8446db44cea3&imgtype=0&src=http%3A%2F%2Fgb.cri.cn%2Fmmsource%2Fimages%2F2013%2F06%2F25%2F90%2F13492636535114937994.jpg",
                        ImageType.Net));
                ListPopWindowManager.getInstance().showStringImagePopWindow(PopWindowType.String_Image_Nobg_fill,list_netImages, btnStringImageNet, this,
                        new ListPopWindowManager.onListPopItemClickListener() {
                            @Override
                            public void onClick(int position) {
                                Toast.makeText(StringImageActivity.this, list_netImages.get(position).getType()+"="+list_netImages.get(position).getContent(), Toast.LENGTH_SHORT).show();
                            }
                        });
                break;
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ListPopWindowManager.getInstance().onDestoryPopWindow(this);
    }
}

package com.example.recipe_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Myholder> {

    private Context mContext;
    private List<Recipes> mData;

    public RecyclerViewAdapter(Context mContext, List<Recipes> mData){
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_recipe, viewGroup, false );

        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int i) {

        holder.recipeTitle.setText(mData.get(i).getRecipeName());

        holder.img_recipe_thumbnail.setImageResource(mData.get(i).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RecipeActivity.class);

                intent.putExtra("Name", mData.get(i).getRecipeName());
                intent.putExtra("Ingredients", mData.get(i).getRecipeIngredients());
                intent.putExtra("MethodTitle", mData.get(i).getRecipeMethodTitle());
                intent.putExtra("Recipe", mData.get(i).getRecipe());

                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Myholder extends RecyclerView.ViewHolder {

        TextView recipeTitle;
        CardView cardView;
        ImageView img_recipe_thumbnail;

        public Myholder(@NonNull View itemView) {
            super(itemView);

            //find cardview's elements by their ID
            recipeTitle = itemView.findViewById(R.id.text_recipe);
            img_recipe_thumbnail = itemView.findViewById(R.id.recipeImgId);
            cardView = itemView.findViewById(R.id.cardViewId);
        }
    }
}

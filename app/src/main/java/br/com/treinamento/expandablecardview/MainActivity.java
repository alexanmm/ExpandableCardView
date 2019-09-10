package br.com.treinamento.expandablecardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout expandableView;
    ImageView imageViewExpandableView;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableView = findViewById(R.id.expandableView);
        imageViewExpandableView = findViewById(R.id.imageViewExpandableView);
        cardView = findViewById(R.id.cardView);

        imageViewExpandableView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (expandableView.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.VISIBLE);
                    imageViewExpandableView.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.GONE);
                    imageViewExpandableView.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }

            }
        });


    }
}

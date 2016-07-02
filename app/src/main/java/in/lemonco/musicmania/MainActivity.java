package in.lemonco.musicmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Gets refrences to all images in main activity
        ImageView acoustic_punjabi_romance_image = (ImageView)findViewById(R.id.acoustic_punjabi_romance_image);
        ImageView Top15_dj_image = (ImageView)findViewById(R.id.Top15_dj_image);
        ImageView sit_comedy_image = (ImageView)findViewById(R.id.sit_comedy_image);
        ImageView matak_image = (ImageView)findViewById(R.id.matak_image);
        ImageView hyde_album = (ImageView)findViewById(R.id.hyde_album);
        ImageView candy_album = (ImageView)findViewById(R.id.candy_album);
        ImageView bollywood_image = (ImageView)findViewById(R.id.bollywood_image);
        ImageView international_top50_image = (ImageView)findViewById(R.id.international_top50_image);
        ImageView punjabi_top50_image = (ImageView)findViewById(R.id.punjabi_top50_image);

        //sets onClickListener of all images in main activity
        acoustic_punjabi_romance_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AcousticPunjabiRomanceActivity.class);
                startActivity(intent);
            }
        });
        Top15_dj_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TopDjActivity.class);
                startActivity(intent);
            }
        });
        sit_comedy_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SitDownComedyActivity.class);
                startActivity(intent);
            }
        });
        matak_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MatakMatakNewReleaseActivity.class);
                startActivity(intent);
            }
        });
        hyde_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HydeNewReleaseActivity.class);
                startActivity(intent);
            }
        });
        candy_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CandyNewReleaseActivity.class);
                startActivity(intent);
            }
        });
        bollywood_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BollywoodTop50Activity.class);
                startActivity(intent);
            }
        });
        international_top50_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),InternationalTop50Activity.class);
                startActivity(intent);
            }
        });
        punjabi_top50_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PunjabiTop50Activity.class);
                startActivity(intent);
            }
        });
        //Get reference of all "ViewAll" textviews in main activity
        TextView viewAllEditorPick = (TextView)findViewById(R.id.viewAllEditorPick);
        TextView viewAllNewRelease = (TextView)findViewById(R.id.viewAllNewRelease);
        TextView viewAllTopCharts = (TextView)findViewById(R.id.viewAllTopCharts);

        //set onClickListener of all "ViewAll" textvies in main activity
        viewAllEditorPick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),EditorsPickAllActivity.class);
                startActivity(intent);

            }
        });
        viewAllNewRelease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NewReleasesAllActivity.class);
                startActivity(intent);
            }
        });
        viewAllTopCharts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TopChartsAllActivity.class);
                startActivity(intent);
            }
        });

       //gets reference to all trending songs in main activity
        LinearLayout trending_song1 = (LinearLayout)findViewById(R.id.trending_song1);
        LinearLayout trending_song2 = (LinearLayout)findViewById(R.id.trending_song2);
        LinearLayout trending_song3 = (LinearLayout)findViewById(R.id.trending_song3);
        LinearLayout trending_song4 = (LinearLayout)findViewById(R.id.trending_song4);

        //set onClickListener of trending songs
        trending_song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NowPlayingActivity.class);
                intent.putExtra("SONGNAME",R.string.song1);
                intent.setType("*/*");
                startActivity(intent);
            }
        });
        trending_song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NowPlayingActivity.class);
                intent.putExtra("SONGNAME",R.string.song2);
                intent.setType("*/*");
                startActivity(intent);
            }
        });
        trending_song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NowPlayingActivity.class);
                intent.putExtra("SONGNAME",R.string.song3);
                intent.setType("*/*");
                startActivity(intent);
            }
        });
        trending_song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NowPlayingActivity.class);
                intent.putExtra("SONGNAME",R.string.song4);
                intent.setType("*/*");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

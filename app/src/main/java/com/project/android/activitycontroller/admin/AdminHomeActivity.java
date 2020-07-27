package com.project.android.activitycontroller.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;

import com.project.android.R;
import com.project.android.UserSelectionActivity;
import com.project.android.utility.AppInstance;
import com.project.android.utility.Constants;

public class AdminHomeActivity extends AppCompatActivity

    {
        private RadioGroup optionsRG;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminhome);
        initializeUIComponents();
    }
        public void initializeUIComponents()
        {
            optionsRG = (RadioGroup) findViewById(R.id.options);
            optionsRG.check(R.id.approveUser);
        }

        public void next(View view)
        {
            int selectedOption = optionsRG.getCheckedRadioButtonId();
            Intent i = null;
            if (selectedOption == R.id.approveUser)
            {
                i = new Intent(getApplicationContext(),ApproveUserActivity.class);
            }
            else if(selectedOption==R.id.addElectionDetails)
            {
                i = new Intent(getApplicationContext(),AddElectionDetailsActivity.class);
            }
            else if(selectedOption==R.id.addCandiateDetails)
            {
                i = new Intent(getApplicationContext(),AddCandiateDetailsActivity.class);
            }
            else if(selectedOption==R.id.sendNotification)
            {
                i = new Intent(getApplicationContext(),SendNotificationActivity.class);
            }
            else if(selectedOption==R.id.viewElection)
            {
                i = new Intent(getApplicationContext(),AddCandiateDetailsActivity.class);
            }
            else if(selectedOption==R.id.viewUsers)
            {
                i = new Intent(getApplicationContext(),ViewUsersActivity.class);
            }
            else if(selectedOption==R.id.viewCandidates)
            {
                i = new Intent(getApplicationContext(),ViewCandidatesActivity.class);
            }
            else if(selectedOption==R.id.viewReport)
            {
                i = new Intent(getApplicationContext(),ViewReportActivity.class);
            }

            else
            {
                i = new Intent(getApplicationContext(),ViewFeedbackActivity.class);
            }

            startActivity(i);

        }



        public boolean onCreateOptionsMenu(android.view.Menu menu)
        {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.admin_menu, menu);
            return true;
        }

        public boolean onOptionsItemSelected(MenuItem item)
        {
            switch (item.getItemId())
            {
                case R.id.about:
                    android.app.AlertDialog.Builder dialogBuilder = new android.app.AlertDialog.Builder(this);
                    dialogBuilder.setIcon(R.drawable.logo);
                    dialogBuilder.setTitle(R.string.app_name);
                    dialogBuilder.setMessage(Constants.APP_DESCRIPTION);
                    dialogBuilder.create();
                    dialogBuilder.show();
                    return true;
                case R.id.logout:
                    ((AppInstance)getApplicationContext()).setAdminUser(false);
                    Intent i = new Intent(this, UserSelectionActivity.class);
                    startActivity(i);
                    finish();
                    return true;
                case R.id.changePassword:
                    Intent intent = new Intent(this, AdminChangePasswordActivity.class);
                    startActivity(intent);
                    return true;


            }
            return false;
        }


        public void onBackPressed()
        {
            moveTaskToBack(true);
        }
    }


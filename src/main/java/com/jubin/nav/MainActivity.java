package com.jubin.nav;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import nnl.nnl.nnl.*;

public class MainActivity extends Toolbar_Drawer_Activity
{

	//@Override
	protected int getDrawerMenuResource()
	{
		return R.menu.sample_drawer_menu;
	}
	
	@Override
	protected boolean hasCollapsingToolbar()
	{
		return true;
	}

	@Override
	protected int getMenuXmlId()
	{
		return R.menu.sample_options_menu;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_layout);
	}

	@Override
	public void _FAB_Click(View v)
	{
		showToast("FAB Clicked");
	}
}


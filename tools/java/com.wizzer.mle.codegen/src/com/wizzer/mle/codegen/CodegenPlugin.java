/**
 * CodegenPlugin.java
 * Created on May 3, 2006
 */

//COPYRIGHT_BEGIN
//
//  Copyright (C) 2000-2007  Wizzer Works
//
//  Wizzer Works makes available all content in this file ("Content").
//  Unless otherwise indicated below, the Content is provided to you
//  under the terms and conditions of the Common Public License Version 1.0
//  ("CPL"). A copy of the CPL is available at
//
//      http://opensource.org/licenses/cpl1.0.php
//
//  For purposes of the CPL, "Program" will mean the Content.
//
//  For information concerning this Makefile, contact Mark S. Millard,
//  of Wizzer Works at msm@wizzerworks.com.
//
//  More information concerning Wizzer Works may be found at
//
//      http://www.wizzerworks.com
//
//COPYRIGHT_END

// Declare package.
package com.wizzer.mle.codegen;

// Import standard Java classes.
import java.util.*;
import java.net.URL;
import java.net.MalformedURLException;

// Import Eclipse classes.
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.plugin.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleContext;


/**
 * The class is the main Eclipse Plug-in class for the com.wizzer.mle.codegen
 * plug-in from Wizzer Works.
 */
public class CodegenPlugin extends AbstractUIPlugin
{
	// The shared instance.
	private static CodegenPlugin m_plugin;
	// Resource bundle.
	private ResourceBundle m_resourceBundle;
	
	/**
	 * The default constructor.
	 */
	public CodegenPlugin()
	{
		super();
		m_plugin = this;
		try {
			m_resourceBundle = ResourceBundle.getBundle("com.wizzer.mle.MlePluginResources");
		} catch (MissingResourceException x) {
			m_resourceBundle = null;
		}
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception
	{
	    // We use System.out.println here instead of MleLog.logInfo because
	    // the plug-in activation will fail otherwise. This happens because
	    // the plug-in has not yet been completely constructed and initialized.
	    System.out.println("Activating com.wizzer.mle.codegen plug-in.");
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception
	{
		System.out.println("Deactivating com.wizzer.mle.studio.codegen plug-in.");
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 */
	public static CodegenPlugin getDefault()
	{
		return m_plugin;
	}

	/**
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key)
	{
		ResourceBundle bundle = CodegenPlugin.getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle()
	{
		return m_resourceBundle;
	}
	
	/**
	 * Create the image descriptor associated with specified image name.
	 * 
	 * @param name The name of the image to retrieve a descriptor for.
	 * 
	 * @return A reference to the new <code>ImageDescriptor</code> is returned.
	 */
	public ImageDescriptor getImageDescriptor(String name)
	{
		try {
			URL url= new URL(getBundle().getEntry("/"), name);
			return ImageDescriptor.createFromURL(url);
		} catch (MalformedURLException e) {
			return ImageDescriptor.getMissingImageDescriptor();
		}
	}
	
	/**
	 * Returns the workspace instance.
	 */
	public static IWorkspace getWorkspace()
	{
		return ResourcesPlugin.getWorkspace();
	}
		
	/**
	 * Get the plug-in identifier.
	 * 
	 * @return A <code>String</code> is returned identifying the plug-in.
	 */
	public static String getID()
	{
		return getDefault().getBundle().getSymbolicName();
	}

}
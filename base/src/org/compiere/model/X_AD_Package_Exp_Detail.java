/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.util.KeyNamePair;

/** Generated Model for AD_Package_Exp_Detail
 *  @author Adempiere (generated) 
 *  @version Release 3.3.1b - $Id$ */
public class X_AD_Package_Exp_Detail extends PO implements I_AD_Package_Exp_Detail, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_Package_Exp_Detail (Properties ctx, int AD_Package_Exp_Detail_ID, String trxName)
    {
      super (ctx, AD_Package_Exp_Detail_ID, trxName);
      /** if (AD_Package_Exp_Detail_ID == 0)
        {
			setAD_Package_Exp_Detail_ID (0);
			setAD_Package_Exp_ID (0);
			setDescription (null);
			setProcessing (false);
			setType (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Package_Exp_Detail (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_AD_Package_Exp_Detail[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_Form getAD_Form() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Form.Table_Name);
        I_AD_Form result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Form)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Form_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Special Form.
		@param AD_Form_ID 
		Special Form
	  */
	public void setAD_Form_ID (int AD_Form_ID)
	{
		if (AD_Form_ID <= 0) 
			set_Value (COLUMNNAME_AD_Form_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
	}

	/** Get Special Form.
		@return Special Form
	  */
	public int getAD_Form_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_ImpFormat getAD_ImpFormat() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_ImpFormat.Table_Name);
        I_AD_ImpFormat result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_ImpFormat)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_ImpFormat_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Import Format.
		@param AD_ImpFormat_ID Import Format	  */
	public void setAD_ImpFormat_ID (int AD_ImpFormat_ID)
	{
		if (AD_ImpFormat_ID <= 0) 
			set_Value (COLUMNNAME_AD_ImpFormat_ID, null);
		else 
			set_Value (COLUMNNAME_AD_ImpFormat_ID, Integer.valueOf(AD_ImpFormat_ID));
	}

	/** Get Import Format.
		@return Import Format	  */
	public int getAD_ImpFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ImpFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** AD_Menu_ID AD_Reference_ID=105 */
	public static final int AD_MENU_ID_AD_Reference_ID=105;
	public I_AD_Menu getAD_Menu() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Menu.Table_Name);
        I_AD_Menu result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Menu)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Menu_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Menu.
		@param AD_Menu_ID 
		Identifies a Menu
	  */
	public void setAD_Menu_ID (int AD_Menu_ID)
	{
		if (AD_Menu_ID <= 0) 
			set_Value (COLUMNNAME_AD_Menu_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Menu_ID, Integer.valueOf(AD_Menu_ID));
	}

	/** Get Menu.
		@return Identifies a Menu
	  */
	public int getAD_Menu_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Menu_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Message getAD_Message() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Message.Table_Name);
        I_AD_Message result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Message)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Message_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Message.
		@param AD_Message_ID 
		System Message
	  */
	public void setAD_Message_ID (int AD_Message_ID)
	{
		if (AD_Message_ID <= 0) 
			set_Value (COLUMNNAME_AD_Message_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Message_ID, Integer.valueOf(AD_Message_ID));
	}

	/** Get Message.
		@return System Message
	  */
	public int getAD_Message_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Message_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Package_Code_New.
		@param AD_Package_Code_New AD_Package_Code_New	  */
	public void setAD_Package_Code_New (String AD_Package_Code_New)
	{

		if (AD_Package_Code_New != null && AD_Package_Code_New.length() > 2000)
		{
			log.warning("Length > 2000 - truncated");
			AD_Package_Code_New = AD_Package_Code_New.substring(0, 2000);
		}
		set_Value (COLUMNNAME_AD_Package_Code_New, AD_Package_Code_New);
	}

	/** Get AD_Package_Code_New.
		@return AD_Package_Code_New	  */
	public String getAD_Package_Code_New () 
	{
		return (String)get_Value(COLUMNNAME_AD_Package_Code_New);
	}

	/** Set AD_Package_Code_Old.
		@param AD_Package_Code_Old AD_Package_Code_Old	  */
	public void setAD_Package_Code_Old (String AD_Package_Code_Old)
	{

		if (AD_Package_Code_Old != null && AD_Package_Code_Old.length() > 2000)
		{
			log.warning("Length > 2000 - truncated");
			AD_Package_Code_Old = AD_Package_Code_Old.substring(0, 2000);
		}
		set_Value (COLUMNNAME_AD_Package_Code_Old, AD_Package_Code_Old);
	}

	/** Get AD_Package_Code_Old.
		@return AD_Package_Code_Old	  */
	public String getAD_Package_Code_Old () 
	{
		return (String)get_Value(COLUMNNAME_AD_Package_Code_Old);
	}

	/** Set AD_Package_Exp_Detail_ID.
		@param AD_Package_Exp_Detail_ID AD_Package_Exp_Detail_ID	  */
	public void setAD_Package_Exp_Detail_ID (int AD_Package_Exp_Detail_ID)
	{
		if (AD_Package_Exp_Detail_ID < 1)
			 throw new IllegalArgumentException ("AD_Package_Exp_Detail_ID is mandatory.");
		set_Value (COLUMNNAME_AD_Package_Exp_Detail_ID, Integer.valueOf(AD_Package_Exp_Detail_ID));
	}

	/** Get AD_Package_Exp_Detail_ID.
		@return AD_Package_Exp_Detail_ID	  */
	public int getAD_Package_Exp_Detail_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Package_Exp_Detail_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_Package_Exp_Detail_ID()));
    }

	/** Set AD_Package_Exp_ID.
		@param AD_Package_Exp_ID AD_Package_Exp_ID	  */
	public void setAD_Package_Exp_ID (int AD_Package_Exp_ID)
	{
		if (AD_Package_Exp_ID < 1)
			 throw new IllegalArgumentException ("AD_Package_Exp_ID is mandatory.");
		set_Value (COLUMNNAME_AD_Package_Exp_ID, Integer.valueOf(AD_Package_Exp_ID));
	}

	/** Get AD_Package_Exp_ID.
		@return AD_Package_Exp_ID	  */
	public int getAD_Package_Exp_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Package_Exp_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_PrintFormat getAD_PrintFormat() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_PrintFormat.Table_Name);
        I_AD_PrintFormat result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_PrintFormat)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_PrintFormat_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Print Format.
		@param AD_PrintFormat_ID 
		Data Print Format
	  */
	public void setAD_PrintFormat_ID (int AD_PrintFormat_ID)
	{
		if (AD_PrintFormat_ID <= 0) 
			set_Value (COLUMNNAME_AD_PrintFormat_ID, null);
		else 
			set_Value (COLUMNNAME_AD_PrintFormat_ID, Integer.valueOf(AD_PrintFormat_ID));
	}

	/** Get Print Format.
		@return Data Print Format
	  */
	public int getAD_PrintFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Process getAD_Process() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Process.Table_Name);
        I_AD_Process result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Process)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Process_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Process.
		@param AD_Process_ID 
		Process or Report
	  */
	public void setAD_Process_ID (int AD_Process_ID)
	{
		if (AD_Process_ID <= 0) 
			set_Value (COLUMNNAME_AD_Process_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
	}

	/** Get Process.
		@return Process or Report
	  */
	public int getAD_Process_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_ReportView getAD_ReportView() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_ReportView.Table_Name);
        I_AD_ReportView result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_ReportView)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_ReportView_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Report View.
		@param AD_ReportView_ID 
		View used to generate this report
	  */
	public void setAD_ReportView_ID (int AD_ReportView_ID)
	{
		if (AD_ReportView_ID <= 0) 
			set_Value (COLUMNNAME_AD_ReportView_ID, null);
		else 
			set_Value (COLUMNNAME_AD_ReportView_ID, Integer.valueOf(AD_ReportView_ID));
	}

	/** Get Report View.
		@return View used to generate this report
	  */
	public int getAD_ReportView_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Role getAD_Role() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Role.Table_Name);
        I_AD_Role result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Role)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Role_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Role.
		@param AD_Role_ID 
		Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID)
	{
		if (AD_Role_ID <= 0) 
			set_Value (COLUMNNAME_AD_Role_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
	}

	/** Get Role.
		@return Responsibility Role
	  */
	public int getAD_Role_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Table getAD_Table() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Table.Table_Name);
        I_AD_Table result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Table)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Table_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Table.
		@param AD_Table_ID 
		Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID)
	{
		if (AD_Table_ID <= 0) 
			set_Value (COLUMNNAME_AD_Table_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
	}

	/** Get Table.
		@return Database Table information
	  */
	public int getAD_Table_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Dynamic Validation.
		@param AD_Val_Rule_ID 
		Dynamic Validation Rule
	  */
	public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
	{
		if (AD_Val_Rule_ID <= 0) 
			set_Value (COLUMNNAME_AD_Val_Rule_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
	}

	/** Get Dynamic Validation.
		@return Dynamic Validation Rule
	  */
	public int getAD_Val_Rule_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Window getAD_Window() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Window.Table_Name);
        I_AD_Window result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Window)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Window_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Window.
		@param AD_Window_ID 
		Data entry or display window
	  */
	public void setAD_Window_ID (int AD_Window_ID)
	{
		if (AD_Window_ID <= 0) 
			set_Value (COLUMNNAME_AD_Window_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
	}

	/** Get Window.
		@return Data entry or display window
	  */
	public int getAD_Window_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Workbench getAD_Workbench() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Workbench.Table_Name);
        I_AD_Workbench result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Workbench)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Workbench_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Workbench.
		@param AD_Workbench_ID 
		Collection of windows, reports
	  */
	public void setAD_Workbench_ID (int AD_Workbench_ID)
	{
		if (AD_Workbench_ID <= 0) 
			set_Value (COLUMNNAME_AD_Workbench_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Workbench_ID, Integer.valueOf(AD_Workbench_ID));
	}

	/** Get Workbench.
		@return Collection of windows, reports
	  */
	public int getAD_Workbench_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workbench_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Workflow getAD_Workflow() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_AD_Workflow.Table_Name);
        I_AD_Workflow result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Workflow)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Workflow_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Workflow.
		@param AD_Workflow_ID 
		Workflow or combination of tasks
	  */
	public void setAD_Workflow_ID (int AD_Workflow_ID)
	{
		if (AD_Workflow_ID <= 0) 
			set_Value (COLUMNNAME_AD_Workflow_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
	}

	/** Get Workflow.
		@return Workflow or combination of tasks
	  */
	public int getAD_Workflow_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workflow_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** DBType AD_Reference_ID=50003 */
	public static final int DBTYPE_AD_Reference_ID=50003;
	/** All Database Types = ALL */
	public static final String DBTYPE_AllDatabaseTypes = "ALL";
	/** DB2 = DB2 */
	public static final String DBTYPE_DB2 = "DB2";
	/** Firebird = Firebird */
	public static final String DBTYPE_Firebird = "Firebird";
	/** MySQL = MySQL */
	public static final String DBTYPE_MySQL = "MySQL";
	/** Oracle = Oracle */
	public static final String DBTYPE_Oracle = "Oracle";
	/** Postgres = Postgres */
	public static final String DBTYPE_Postgres = "Postgres";
	/** SQL Server = SQL */
	public static final String DBTYPE_SQLServer = "SQL";
	/** Sybase = Sybase */
	public static final String DBTYPE_Sybase = "Sybase";
	/** Set DBType.
		@param DBType DBType	  */
	public void setDBType (String DBType)
	{

		if (DBType == null || DBType.equals("ALL") || DBType.equals("DB2") || DBType.equals("Firebird") || DBType.equals("MySQL") || DBType.equals("Oracle") || DBType.equals("Postgres") || DBType.equals("SQL") || DBType.equals("Sybase")); else throw new IllegalArgumentException ("DBType Invalid value - " + DBType + " - Reference_ID=50003 - ALL - DB2 - Firebird - MySQL - Oracle - Postgres - SQL - Sybase");
		if (DBType != null && DBType.length() > 22)
		{
			log.warning("Length > 22 - truncated");
			DBType = DBType.substring(0, 22);
		}
		set_Value (COLUMNNAME_DBType, DBType);
	}

	/** Get DBType.
		@return DBType	  */
	public String getDBType () 
	{
		return (String)get_Value(COLUMNNAME_DBType);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		if (Description == null)
			throw new IllegalArgumentException ("Description is mandatory.");

		if (Description.length() > 1000)
		{
			log.warning("Length > 1000 - truncated");
			Description = Description.substring(0, 1000);
		}
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Destination_Directory.
		@param Destination_Directory Destination_Directory	  */
	public void setDestination_Directory (String Destination_Directory)
	{

		if (Destination_Directory != null && Destination_Directory.length() > 255)
		{
			log.warning("Length > 255 - truncated");
			Destination_Directory = Destination_Directory.substring(0, 255);
		}
		set_Value (COLUMNNAME_Destination_Directory, Destination_Directory);
	}

	/** Get Destination_Directory.
		@return Destination_Directory	  */
	public String getDestination_Directory () 
	{
		return (String)get_Value(COLUMNNAME_Destination_Directory);
	}

	/** Set Destination_FileName.
		@param Destination_FileName Destination_FileName	  */
	public void setDestination_FileName (String Destination_FileName)
	{

		if (Destination_FileName != null && Destination_FileName.length() > 255)
		{
			log.warning("Length > 255 - truncated");
			Destination_FileName = Destination_FileName.substring(0, 255);
		}
		set_Value (COLUMNNAME_Destination_FileName, Destination_FileName);
	}

	/** Get Destination_FileName.
		@return Destination_FileName	  */
	public String getDestination_FileName () 
	{
		return (String)get_Value(COLUMNNAME_Destination_FileName);
	}

	/** Set File Name.
		@param FileName 
		Name of the local file or URL
	  */
	public void setFileName (String FileName)
	{

		if (FileName != null && FileName.length() > 255)
		{
			log.warning("Length > 255 - truncated");
			FileName = FileName.substring(0, 255);
		}
		set_Value (COLUMNNAME_FileName, FileName);
	}

	/** Get File Name.
		@return Name of the local file or URL
	  */
	public String getFileName () 
	{
		return (String)get_Value(COLUMNNAME_FileName);
	}

	/** Set File_Directory.
		@param File_Directory File_Directory	  */
	public void setFile_Directory (String File_Directory)
	{

		if (File_Directory != null && File_Directory.length() > 255)
		{
			log.warning("Length > 255 - truncated");
			File_Directory = File_Directory.substring(0, 255);
		}
		set_Value (COLUMNNAME_File_Directory, File_Directory);
	}

	/** Get File_Directory.
		@return File_Directory	  */
	public String getFile_Directory () 
	{
		return (String)get_Value(COLUMNNAME_File_Directory);
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name 2.
		@param Name2 
		Additional Name
	  */
	public void setName2 (String Name2)
	{

		if (Name2 != null && Name2.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			Name2 = Name2.substring(0, 60);
		}
		set_Value (COLUMNNAME_Name2, Name2);
	}

	/** Get Name 2.
		@return Additional Name
	  */
	public String getName2 () 
	{
		return (String)get_Value(COLUMNNAME_Name2);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** ReleaseNo AD_Reference_ID=50002 */
	public static final int RELEASENO_AD_Reference_ID=50002;
	/** Release 2.5.2a = Release 2.5.2a */
	public static final String RELEASENO_Release252a = "Release 2.5.2a";
	/** Release 2.5.2b = Release 2.5.2b */
	public static final String RELEASENO_Release252b = "Release 2.5.2b";
	/** Release 2.5.2c = Release 2.5.2c */
	public static final String RELEASENO_Release252c = "Release 2.5.2c";
	/** Release 2.5.2d = Release 2.5.2d */
	public static final String RELEASENO_Release252d = "Release 2.5.2d";
	/** Release 2.5.2e = Release 2.5.2e */
	public static final String RELEASENO_Release252e = "Release 2.5.2e";
	/** Release 2.5.3a = Release 2.5.3a */
	public static final String RELEASENO_Release253a = "Release 2.5.3a";
	/** Release 2.5.3b = Release 2.5.3b */
	public static final String RELEASENO_Release253b = "Release 2.5.3b";
	/** No specific release = all */
	public static final String RELEASENO_NoSpecificRelease = "all";
	/** Set Release No.
		@param ReleaseNo 
		Internal Release Number
	  */
	public void setReleaseNo (String ReleaseNo)
	{

		if (ReleaseNo == null || ReleaseNo.equals("Release 2.5.2a") || ReleaseNo.equals("Release 2.5.2b") || ReleaseNo.equals("Release 2.5.2c") || ReleaseNo.equals("Release 2.5.2d") || ReleaseNo.equals("Release 2.5.2e") || ReleaseNo.equals("Release 2.5.3a") || ReleaseNo.equals("Release 2.5.3b") || ReleaseNo.equals("all")); else throw new IllegalArgumentException ("ReleaseNo Invalid value - " + ReleaseNo + " - Reference_ID=50002 - Release 2.5.2a - Release 2.5.2b - Release 2.5.2c - Release 2.5.2d - Release 2.5.2e - Release 2.5.3a - Release 2.5.3b - all");
		if (ReleaseNo != null && ReleaseNo.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			ReleaseNo = ReleaseNo.substring(0, 20);
		}
		set_Value (COLUMNNAME_ReleaseNo, ReleaseNo);
	}

	/** Get Release No.
		@return Internal Release Number
	  */
	public String getReleaseNo () 
	{
		return (String)get_Value(COLUMNNAME_ReleaseNo);
	}

	/** Set SQLStatement.
		@param SQLStatement SQLStatement	  */
	public void setSQLStatement (String SQLStatement)
	{

		if (SQLStatement != null && SQLStatement.length() > 2000)
		{
			log.warning("Length > 2000 - truncated");
			SQLStatement = SQLStatement.substring(0, 2000);
		}
		set_Value (COLUMNNAME_SQLStatement, SQLStatement);
	}

	/** Get SQLStatement.
		@return SQLStatement	  */
	public String getSQLStatement () 
	{
		return (String)get_Value(COLUMNNAME_SQLStatement);
	}

	/** Set Target_Directory.
		@param Target_Directory Target_Directory	  */
	public void setTarget_Directory (String Target_Directory)
	{

		if (Target_Directory != null && Target_Directory.length() > 255)
		{
			log.warning("Length > 255 - truncated");
			Target_Directory = Target_Directory.substring(0, 255);
		}
		set_Value (COLUMNNAME_Target_Directory, Target_Directory);
	}

	/** Get Target_Directory.
		@return Target_Directory	  */
	public String getTarget_Directory () 
	{
		return (String)get_Value(COLUMNNAME_Target_Directory);
	}

	/** Type AD_Reference_ID=50004 */
	public static final int TYPE_AD_Reference_ID=50004;
	/** Workbench = B */
	public static final String TYPE_Workbench = "B";
	/** File - Code or other = C */
	public static final String TYPE_File_CodeOrOther = "C";
	/** Data = D */
	public static final String TYPE_Data = "D";
	/** Workflow = F */
	public static final String TYPE_Workflow = "F";
	/** Import Format = IMP */
	public static final String TYPE_ImportFormat = "IMP";
	/** Application or Module = M */
	public static final String TYPE_ApplicationOrModule = "M";
	/** Process/Report = P */
	public static final String TYPE_ProcessReport = "P";
	/** ReportView = R */
	public static final String TYPE_ReportView = "R";
	/** Role = S */
	public static final String TYPE_Role = "S";
	/** Code Snipit = SNI */
	public static final String TYPE_CodeSnipit = "SNI";
	/** SQL Statement = SQL */
	public static final String TYPE_SQLStatement = "SQL";
	/** Table = T */
	public static final String TYPE_Table = "T";
	/** Window = W */
	public static final String TYPE_Window = "W";
	/** Form = X */
	public static final String TYPE_Form = "X";
	/** Dynamic Validation Rule = V */
	public static final String TYPE_DynamicValidationRule = "V";
	/** Message = MSG */
	public static final String TYPE_Message = "MSG";
	/** PrintFormat = PFT */
	public static final String TYPE_PrintFormat = "PFT";
	/** Set Type.
		@param Type 
		Type of Validation (SQL, Java Script, Java Language)
	  */
	public void setType (String Type)
	{
		if (Type == null) throw new IllegalArgumentException ("Type is mandatory");
		if (Type.equals("B") || Type.equals("C") || Type.equals("D") || Type.equals("F") || Type.equals("IMP") || Type.equals("M") || Type.equals("P") || Type.equals("R") || Type.equals("S") || Type.equals("SNI") || Type.equals("SQL") || Type.equals("T") || Type.equals("W") || Type.equals("X") || Type.equals("V") || Type.equals("MSG") || Type.equals("PFT")); else throw new IllegalArgumentException ("Type Invalid value - " + Type + " - Reference_ID=50004 - B - C - D - F - IMP - M - P - R - S - SNI - SQL - T - W - X - V - MSG - PFT");
		if (Type.length() > 10)
		{
			log.warning("Length > 10 - truncated");
			Type = Type.substring(0, 10);
		}
		set_Value (COLUMNNAME_Type, Type);
	}

	/** Get Type.
		@return Type of Validation (SQL, Java Script, Java Language)
	  */
	public String getType () 
	{
		return (String)get_Value(COLUMNNAME_Type);
	}
}
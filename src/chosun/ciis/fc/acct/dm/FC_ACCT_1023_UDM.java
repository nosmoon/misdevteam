/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1023_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_type_cd;
	public String acct_cd;
	public String acct_nm;
	public String logic;
	public String flag;
	public String chg_pers;

	public FC_ACCT_1023_UDM(){}
	public FC_ACCT_1023_UDM(String cmpy_cd, String acct_type_cd, String acct_cd, String acct_nm, String logic, String flag, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.acct_type_cd = acct_type_cd;
		this.acct_cd = acct_cd;
		this.acct_nm = acct_nm;
		this.logic = logic;
		this.flag = flag;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public void setAcct_type_cd(String acct_type_cd){
		this.acct_type_cd = acct_type_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}
	
	public void setLogic(String logic){
		this.logic = logic;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}
	
	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_type_cd(){
		return this.acct_type_cd;
	}
	
	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}
	
	public String getLogic(){
		return this.logic;
	}

	public String getFlag(){
		return this.flag;
	}
	
	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1023_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1023_UDM dm = (FC_ACCT_1023_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_type_cd);
		cstmt.setString(5, dm.acct_cd);
		cstmt.setString(6, dm.acct_nm);
		cstmt.setString(7, dm.logic);
		cstmt.setString(8, dm.flag);
		cstmt.setString(9, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1023_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_type_cd = [" + getAcct_type_cd() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("acct_nm = [" + getAcct_nm() + "]");
		System.out.println("logic = [" + getLogic() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String logic = req.getParameter("logic");
if( logic == null){
	System.out.println(this.toString+" : logic is null" );
}else{
	System.out.println(this.toString+" : logic is "+logic );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String logic = Util.checkString(req.getParameter("logic"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String logic = Util.Uni2Ksc(Util.checkString(req.getParameter("logic")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd(acct_cd);
dm.setLogic(logic);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 13 11:12:40 KST 2014 */
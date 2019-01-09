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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_5021_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pch_cymd1fr;
	public String insr_clsf_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;

	public FC_FUNC_5021_LDM(){}
	public FC_FUNC_5021_LDM(String cmpy_cd, String pch_cymd1fr, String insr_clsf_cd, String dlco_clsf_cd, String dlco_cd){
		this.cmpy_cd = cmpy_cd;
		this.pch_cymd1fr = pch_cymd1fr;
		this.insr_clsf_cd = insr_clsf_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPch_cymd1fr(String pch_cymd1fr){
		this.pch_cymd1fr = pch_cymd1fr;
	}

	public void setInsr_clsf_cd(String insr_clsf_cd){
		this.insr_clsf_cd = insr_clsf_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPch_cymd1fr(){
		return this.pch_cymd1fr;
	}

	public String getInsr_clsf_cd(){
		return this.insr_clsf_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_5021_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_5021_LDM dm = (FC_FUNC_5021_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pch_cymd1fr);
		cstmt.setString(5, dm.insr_clsf_cd);
		cstmt.setString(6, dm.dlco_clsf_cd);
		cstmt.setString(7, dm.dlco_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_5021_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pch_cymd1fr = [" + getPch_cymd1fr() + "]");
		System.out.println("insr_clsf_cd = [" + getInsr_clsf_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
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
String pch_cymd1fr = req.getParameter("pch_cymd1fr");
if( pch_cymd1fr == null){
	System.out.println(this.toString+" : pch_cymd1fr is null" );
}else{
	System.out.println(this.toString+" : pch_cymd1fr is "+pch_cymd1fr );
}
String insr_clsf_cd = req.getParameter("insr_clsf_cd");
if( insr_clsf_cd == null){
	System.out.println(this.toString+" : insr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : insr_clsf_cd is "+insr_clsf_cd );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
String insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pch_cymd1fr = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd1fr")));
String insr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_clsf_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setPch_cymd1fr(pch_cymd1fr);
dm.setInsr_clsf_cd(insr_clsf_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 01 11:18:53 KST 2009 */
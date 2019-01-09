/***************************************************************************************************
* ���ϸ� : .java
* ��� : 	   
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_5010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String paymethodcode;
	public String proc_clsf;
	public String dt_clsf;
	public String pymtyymm;
	public String frdt;
	public String todt;

	public TN_LNK_5010_LDM(){}
	public TN_LNK_5010_LDM(String cmpy_cd, String paymethodcode, String proc_clsf, String dt_clsf, String pymtyymm, String frdt, String todt){
		this.cmpy_cd = cmpy_cd;
		this.paymethodcode = paymethodcode;
		this.proc_clsf = proc_clsf;
		this.dt_clsf = dt_clsf;
		this.pymtyymm = pymtyymm;
		this.frdt = frdt;
		this.todt = todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setDt_clsf(String dt_clsf){
		this.dt_clsf = dt_clsf;
	}

	public void setPymtyymm(String pymtyymm){
		this.pymtyymm = pymtyymm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getDt_clsf(){
		return this.dt_clsf;
	}

	public String getPymtyymm(){
		return this.pymtyymm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_5010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_5010_LDM dm = (TN_LNK_5010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.paymethodcode);
		cstmt.setString(5, dm.proc_clsf);
		cstmt.setString(6, dm.dt_clsf);
		cstmt.setString(7, dm.pymtyymm);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_5010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("paymethodcode = [" + getPaymethodcode() + "]");
		System.out.println("proc_clsf = [" + getProc_clsf() + "]");
		System.out.println("dt_clsf = [" + getDt_clsf() + "]");
		System.out.println("pymtyymm = [" + getPymtyymm() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
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
String paymethodcode = req.getParameter("paymethodcode");
if( paymethodcode == null){
	System.out.println(this.toString+" : paymethodcode is null" );
}else{
	System.out.println(this.toString+" : paymethodcode is "+paymethodcode );
}
String proc_clsf = req.getParameter("proc_clsf");
if( proc_clsf == null){
	System.out.println(this.toString+" : proc_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_clsf is "+proc_clsf );
}
String dt_clsf = req.getParameter("dt_clsf");
if( dt_clsf == null){
	System.out.println(this.toString+" : dt_clsf is null" );
}else{
	System.out.println(this.toString+" : dt_clsf is "+dt_clsf );
}
String pymtyymm = req.getParameter("pymtyymm");
if( pymtyymm == null){
	System.out.println(this.toString+" : pymtyymm is null" );
}else{
	System.out.println(this.toString+" : pymtyymm is "+pymtyymm );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
String pymtyymm = Util.checkString(req.getParameter("pymtyymm"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String paymethodcode = Util.Uni2Ksc(Util.checkString(req.getParameter("paymethodcode")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
String dt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_clsf")));
String pymtyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtyymm")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setPaymethodcode(paymethodcode);
dm.setProc_clsf(proc_clsf);
dm.setDt_clsf(dt_clsf);
dm.setPymtyymm(pymtyymm);
dm.setFrdt(frdt);
dm.setTodt(todt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 29 10:55:50 KST 2016 */
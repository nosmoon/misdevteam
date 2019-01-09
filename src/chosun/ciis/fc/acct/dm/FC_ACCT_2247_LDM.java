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


public class FC_ACCT_2247_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_num;
	public String frdt;
	public String todt;
	public String extnc_dt;
	public String remark;
	public String tran_clsfy;

	public FC_ACCT_2247_LDM(){}
	public FC_ACCT_2247_LDM(String cmpy_cd, String acct_num, String frdt, String todt, String extnc_dt, String remark, String tran_clsfy){
		this.cmpy_cd = cmpy_cd;
		this.acct_num = acct_num;
		this.frdt = frdt;
		this.todt = todt;
		this.extnc_dt = extnc_dt;
		this.remark = remark;
		this.tran_clsfy = tran_clsfy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setExtnc_dt(String extnc_dt){
		this.extnc_dt = extnc_dt;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public void setTran_clsfy(String tran_clsfy){
		this.tran_clsfy = tran_clsfy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getExtnc_dt(){
		return this.extnc_dt;
	}

	public String getRemark(){
		return this.remark;
	}

	public String getTran_clsfy(){
		return this.tran_clsfy;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2247_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2247_LDM dm = (FC_ACCT_2247_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_num);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.extnc_dt);
		cstmt.setString(8, dm.remark);
		cstmt.setString(9, dm.tran_clsfy);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2247_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("extnc_dt = [" + getExtnc_dt() + "]");
		System.out.println("remark = [" + getRemark() + "]");
		System.out.println("tran_clsfy = [" + getTran_clsfy() + "]");
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
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
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
String extnc_dt = req.getParameter("extnc_dt");
if( extnc_dt == null){
	System.out.println(this.toString+" : extnc_dt is null" );
}else{
	System.out.println(this.toString+" : extnc_dt is "+extnc_dt );
}
String remark = req.getParameter("remark");
if( remark == null){
	System.out.println(this.toString+" : remark is null" );
}else{
	System.out.println(this.toString+" : remark is "+remark );
}
String tran_clsfy = req.getParameter("tran_clsfy");
if( tran_clsfy == null){
	System.out.println(this.toString+" : tran_clsfy is null" );
}else{
	System.out.println(this.toString+" : tran_clsfy is "+tran_clsfy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String extnc_dt = Util.checkString(req.getParameter("extnc_dt"));
String remark = Util.checkString(req.getParameter("remark"));
String tran_clsfy = Util.checkString(req.getParameter("tran_clsfy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String extnc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_dt")));
String remark = Util.Uni2Ksc(Util.checkString(req.getParameter("remark")));
String tran_clsfy = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_clsfy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_num(acct_num);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setExtnc_dt(extnc_dt);
dm.setRemark(remark);
dm.setTran_clsfy(tran_clsfy);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 09 16:30:19 KST 2016 */
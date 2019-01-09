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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_1850_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_no;
	public String frdt;
	public String rcpm_frdt;
	public String rcpm_todt;

	public AD_DEP_1850_LDM(){}
	public AD_DEP_1850_LDM(String cmpy_cd, String dlco_no, String frdt, String rcpm_frdt, String rcpm_todt){
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.frdt = frdt;
		this.rcpm_frdt = rcpm_frdt;
		this.rcpm_todt = rcpm_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setRcpm_frdt(String rcpm_frdt){
		this.rcpm_frdt = rcpm_frdt;
	}

	public void setRcpm_todt(String rcpm_todt){
		this.rcpm_todt = rcpm_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getRcpm_frdt(){
		return this.rcpm_frdt;
	}

	public String getRcpm_todt(){
		return this.rcpm_todt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_1850_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_1850_LDM dm = (AD_DEP_1850_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_no);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.rcpm_frdt);
		cstmt.setString(7, dm.rcpm_todt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_1850_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("rcpm_frdt = [" + getRcpm_frdt() + "]");
		System.out.println("rcpm_todt = [" + getRcpm_todt() + "]");
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String rcpm_frdt = req.getParameter("rcpm_frdt");
if( rcpm_frdt == null){
	System.out.println(this.toString+" : rcpm_frdt is null" );
}else{
	System.out.println(this.toString+" : rcpm_frdt is "+rcpm_frdt );
}
String rcpm_todt = req.getParameter("rcpm_todt");
if( rcpm_todt == null){
	System.out.println(this.toString+" : rcpm_todt is null" );
}else{
	System.out.println(this.toString+" : rcpm_todt is "+rcpm_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String frdt = Util.checkString(req.getParameter("frdt"));
String rcpm_frdt = Util.checkString(req.getParameter("rcpm_frdt"));
String rcpm_todt = Util.checkString(req.getParameter("rcpm_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String rcpm_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_frdt")));
String rcpm_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setFrdt(frdt);
dm.setRcpm_frdt(rcpm_frdt);
dm.setRcpm_todt(rcpm_todt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 23 13:21:44 KST 2009 */
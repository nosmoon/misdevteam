/***************************************************************************************************
* ���ϸ� : .java
* ��� : ����Ź���ݰ�꼭 ���ε�
* �ۼ����� : 2011.02.07
* �ۼ��� : KBS
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.tax.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_TAX_2710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String elec_tax_comp_cd;
	public String approve_id;
	public String byr_value;
	public String byr_flag;
	public String broker_value;
	public String broker_flag;
	public String incmg_pers;

	public AD_TAX_2710_LDM(){}
	
	public AD_TAX_2710_LDM(String cmpy_cd, String frdt, String todt, String elec_tax_comp_cd, String approve_id, String byr_value, String byr_flag, String broker_value, String broker_flag, String incmg_pers) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.approve_id = approve_id;
		this.byr_value = byr_value;
		this.byr_flag = byr_flag;
		this.broker_value = broker_value;
		this.broker_flag = broker_flag;
		this.incmg_pers = incmg_pers;
	}


	public String getApprove_id() {
		return approve_id;
	}

	public void setApprove_id(String approve_id) {
		this.approve_id = approve_id;
	}

	public String getBroker_flag() {
		return broker_flag;
	}

	public void setBroker_flag(String broker_flag) {
		this.broker_flag = broker_flag;
	}

	public String getBroker_value() {
		return broker_value;
	}

	public void setBroker_value(String broker_value) {
		this.broker_value = broker_value;
	}

	public String getByr_flag() {
		return byr_flag;
	}

	public void setByr_flag(String byr_flag) {
		this.byr_flag = byr_flag;
	}

	public String getByr_value() {
		return byr_value;
	}

	public void setByr_value(String byr_value) {
		this.byr_value = byr_value;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getElec_tax_comp_cd() {
		return elec_tax_comp_cd;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd) {
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public String getFrdt() {
		return frdt;
	}

	public void setFrdt(String frdt) {
		this.frdt = frdt;
	}

	public String getIncmg_pers() {
		return incmg_pers;
	}

	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}

	public String getTodt() {
		return todt;
	}

	public void setTodt(String todt) {
		this.todt = todt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_TAX_2710_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_2710_LDM dm = (AD_TAX_2710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.elec_tax_comp_cd);
		cstmt.setString(7, dm.approve_id);
		cstmt.setString(8, dm.byr_value);
		cstmt.setString(9, dm.byr_flag);
		cstmt.setString(10, dm.broker_value);
		cstmt.setString(11, dm.broker_flag);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_2710_LDataSet();
	}

	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
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
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 27 13:48:46 KST 2009 */
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


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_1610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String bank_cd;
	public String note_clsf_cd;
	public String issu_pers_nm;
	public String rcpm_acct;
	public String sale_aprv_no;
	public String note_amt;

	public AD_CO_1610_LDM(){}
	

	public AD_CO_1610_LDM(String cmpy_cd, String frdt, String todt, String bank_cd, String note_clsf_cd, String issu_pers_nm, String rcpm_acct, String sale_aprv_no, String note_amt) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.bank_cd = bank_cd;
		this.note_clsf_cd = note_clsf_cd;
		this.issu_pers_nm = issu_pers_nm;
		this.rcpm_acct = rcpm_acct;
		this.sale_aprv_no = sale_aprv_no;
		this.note_amt = note_amt;
	}


	public String getBank_cd() {
		return bank_cd;
	}


	public void setBank_cd(String bank_cd) {
		this.bank_cd = bank_cd;
	}


	public String getCmpy_cd() {
		return cmpy_cd;
	}


	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}


	public String getFrdt() {
		return frdt;
	}


	public void setFrdt(String frdt) {
		this.frdt = frdt;
	}


	public String getIssu_pers_nm() {
		return issu_pers_nm;
	}


	public void setIssu_pers_nm(String issu_pers_nm) {
		this.issu_pers_nm = issu_pers_nm;
	}


	public String getNote_amt() {
		return note_amt;
	}


	public void setNote_amt(String note_amt) {
		this.note_amt = note_amt;
	}


	public String getNote_clsf_cd() {
		return note_clsf_cd;
	}


	public void setNote_clsf_cd(String note_clsf_cd) {
		this.note_clsf_cd = note_clsf_cd;
	}


	public String getRcpm_acct() {
		return rcpm_acct;
	}


	public void setRcpm_acct(String rcpm_acct) {
		this.rcpm_acct = rcpm_acct;
	}


	public String getSale_aprv_no() {
		return sale_aprv_no;
	}


	public void setSale_aprv_no(String sale_aprv_no) {
		this.sale_aprv_no = sale_aprv_no;
	}


	public String getTodt() {
		return todt;
	}


	public void setTodt(String todt) {
		this.todt = todt;
	}


	public String getSQL(){
		 return "{ call SP_AD_CO_1610_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_1610_LDM dm = (AD_CO_1610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.bank_cd);
		cstmt.setString(7, dm.note_clsf_cd);
		cstmt.setString(8, dm.issu_pers_nm);
		cstmt.setString(9, dm.rcpm_acct);
		cstmt.setString(10, dm.sale_aprv_no);
		cstmt.setString(11, dm.note_amt);
		
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_1610_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 02 15:48:45 KST 2009 */
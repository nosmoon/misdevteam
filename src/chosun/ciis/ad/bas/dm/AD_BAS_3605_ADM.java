/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.16
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */
public class AD_BAS_3605_ADM extends somo.framework.db.BaseDM implements java.io.Serializable
{
	public String flag;
/* KEY */	
	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_no;
	public String cust_seq;
/* 수정사항 */
	public String cust_item_yn;
	public String cust_item;
	public String slcrg_pers_yn;
	public String slcrg_pers;
	public String mchrg_pers_yn;
	public String mchrg_pers;
/* 입력자 */     
	public String incmg_pers_ip;
	public String incmg_pers;


	public AD_BAS_3605_ADM(){}
	
 
	public AD_BAS_3605_ADM(String flag, String cmpy_cd, String medi_clsf, String dlco_no, String cust_seq, String cust_item_yn, String cust_item, String slcrg_pers_yn, String slcrg_pers, String mchrg_pers_yn, String mchrg_pers, String incmg_pers_ip, String incmg_pers) {
		super();
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.dlco_no = dlco_no;
		this.cust_seq = cust_seq;
		this.cust_item_yn = cust_item_yn;
		this.cust_item = cust_item;
		this.slcrg_pers_yn = slcrg_pers_yn;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers_yn = mchrg_pers_yn;
		this.mchrg_pers = mchrg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}


	public String getCmpy_cd() {
		return cmpy_cd;
	}


	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}


	public String getCust_item() {
		return cust_item;
	}


	public void setCust_item(String cust_item) {
		this.cust_item = cust_item;
	}


	public String getCust_item_yn() {
		return cust_item_yn;
	}


	public void setCust_item_yn(String cust_item_yn) {
		this.cust_item_yn = cust_item_yn;
	}


	public String getCust_seq() {
		return cust_seq;
	}


	public void setCust_seq(String cust_seq) {
		this.cust_seq = cust_seq;
	}


	public String getDlco_no() {
		return dlco_no;
	}


	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}


	public String getFlag() {
		return flag;
	}


	public void setFlag(String flag) {
		this.flag = flag;
	}


	public String getIncmg_pers() {
		return incmg_pers;
	}


	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}


	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}


	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}


	public String getMchrg_pers() {
		return mchrg_pers;
	}


	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}


	public String getMchrg_pers_yn() {
		return mchrg_pers_yn;
	}


	public void setMchrg_pers_yn(String mchrg_pers_yn) {
		this.mchrg_pers_yn = mchrg_pers_yn;
	}


	public String getMedi_clsf() {
		return medi_clsf;
	}


	public void setMedi_clsf(String medi_clsf) {
		this.medi_clsf = medi_clsf;
	}


	public String getSlcrg_pers() {
		return slcrg_pers;
	}


	public void setSlcrg_pers(String slcrg_pers) {
		this.slcrg_pers = slcrg_pers;
	}


	public String getSlcrg_pers_yn() {
		return slcrg_pers_yn;
	}


	public void setSlcrg_pers_yn(String slcrg_pers_yn) {
		this.slcrg_pers_yn = slcrg_pers_yn;
	}


	public String getSQL()
	{
		 return "{ call SP_AD_BAS_3605_A(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException
	{
		AD_BAS_3605_ADM dm = (AD_BAS_3605_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.cust_seq);
		cstmt.setString(8, dm.cust_item_yn);
		cstmt.setString(9, dm.cust_item);
		cstmt.setString(10, dm.slcrg_pers_yn);
		cstmt.setString(11, dm.slcrg_pers);
		cstmt.setString(12, dm.mchrg_pers_yn);
		cstmt.setString(13, dm.mchrg_pers);     
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject()
	{
		return new chosun.ciis.ad.bas.ds.AD_BAS_3605_ADataSet();
	}



    public void print(){
        System.out.println("flag = " + getFlag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("medi_clsf = " + getMedi_clsf());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("cust_seq = " + getCust_seq());
    }
}
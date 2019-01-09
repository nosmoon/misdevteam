/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.dlco.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.ds.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1009_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String dlco_no;
	public String clsf;
	public byte[] seal_phot;
	public String seal_file_size;
	public byte[] ern_phot;
	public String ern_file_size;
	public byte[] acct_aplc_frm;
	public String acct_aplc_frm_file_size;
	public byte[] psbk_copy;
	public String psbk_copy_file_size;
	public byte[] use_seal;
	public String use_seal_file_size;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public CO_DLCO_1009_ADM(){}
	public CO_DLCO_1009_ADM(String accflag, String dlco_no, String clsf, byte[] seal_phot, String seal_file_size, byte[] ern_phot, String ern_file_size, byte[] acct_aplc_frm, String acct_aplc_frm_file_size, byte[] psbk_copy, String psbk_copy_file_size, byte[] use_seal, String use_seal_file_size, String incmg_pers, String incmg_pers_ipadd){
		this.accflag = accflag;
		this.dlco_no = dlco_no;
		this.clsf = clsf;
		this.seal_phot = seal_phot;
		this.seal_file_size = seal_file_size;
		this.ern_phot = ern_phot;
		this.ern_file_size = ern_file_size;
		this.acct_aplc_frm = acct_aplc_frm;
		this.acct_aplc_frm_file_size =acct_aplc_frm_file_size;
		this.psbk_copy = psbk_copy;
		this.psbk_copy_file_size = psbk_copy_file_size;
		this.use_seal = use_seal;
		this.use_seal_file_size = use_seal_file_size;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}
	
	public void setSeal_phot(byte[] seal_phot){
		this.seal_phot = seal_phot;
	}

	public void setSeal_file_size(String seal_file_size){
		this.seal_file_size = seal_file_size;
	}

	public void setErn_phot(byte[] ern_phot){
		this.ern_phot = ern_phot;
	}

	public void setErn_file_size(String ern_file_size){
		this.ern_file_size = ern_file_size;
	}
	
	public void setAcct_aplc_frm(byte[] acct_aplc_frm){
		this.acct_aplc_frm = acct_aplc_frm;
	}

	public void setAcct_aplc_frm_file_size(String acct_aplc_frm_file_size){
		this.acct_aplc_frm_file_size = acct_aplc_frm_file_size;
	}
	
	public void setPsbk_copy(byte[] psbk_copy){
		this.psbk_copy = psbk_copy;
	}

	public void setPsbk_copy_file_size(String psbk_copy_file_size){
		this.psbk_copy_file_size = psbk_copy_file_size;
	}
	
	public void setUse_seal(byte[] use_seal){
		this.use_seal = use_seal;
	}

	public void setUse_seal_file_size(String use_seal_file_size){
		this.use_seal_file_size = use_seal_file_size;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getClsf(){
		return this.clsf;
	}
	
	public byte[] getSeal_phot(){
		return this.seal_phot;
	}

	public String getSeal_file_size(){
		return this.seal_file_size;
	}

	public byte[] getErn_phot(){
		return this.ern_phot;
	}

	public String getErn_file_size(){
		return this.ern_file_size;
	}
	
	public byte[] getAcct_aplc_frm(){
		return this.acct_aplc_frm;
	}

	public String getAcct_aplc_frm_file_size(){
		return this.acct_aplc_frm_file_size;
	}
	
	public byte[] getPsbk_copy(){
		return this.psbk_copy;
	}

	public String getPsbk_copy_file_size(){
		return this.psbk_copy_file_size;
	}
	
	public byte[] getUse_seal(){
		return this.use_seal;
	}

	public String getUse_seal_file_size(){
		return this.use_seal_file_size;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_DLCO_1009_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?,?,?,?,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DLCO_1009_ADM dm = (CO_DLCO_1009_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.dlco_no);
		cstmt.setString(5, dm.clsf);
		cstmt.setBytes(6, "1010".getBytes());
		cstmt.setString(7, dm.seal_file_size);
		cstmt.setBytes(8, "1010".getBytes());
		cstmt.setString(9, dm.ern_file_size);
		cstmt.setBytes(10, "1010".getBytes());
		cstmt.setString(11, dm.acct_aplc_frm_file_size);
		cstmt.setBytes(12, "1010".getBytes());
		cstmt.setString(13, dm.psbk_copy_file_size);
		cstmt.setBytes(14, "1010".getBytes());
		cstmt.setString(15, dm.use_seal_file_size);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.dlco.ds.CO_DLCO_1009_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("seal_phot = [" + getSeal_phot() + "]");
		System.out.println("seal_file_size = [" + getSeal_file_size() + "]");
		System.out.println("ern_phot = [" + getErn_phot() + "]");
		System.out.println("ern_file_size = [" + getErn_file_size() + "]");
		System.out.println("acct_aplc_frm = [" + getAcct_aplc_frm() + "]");
		System.out.println("acct_aplc_frm_file_size = [" + getAcct_aplc_frm_file_size() + "]");
		System.out.println("psbk_copy = [" + getPsbk_copy() + "]");
		System.out.println("psbk_copy_file_size = [" + getPsbk_copy_file_size() + "]");
		System.out.println("use_seal = [" + getUse_seal() + "]");
		System.out.println("use_seal_file_size = [" + getUse_seal_file_size() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String seal_phot = req.getParameter("seal_phot");
if( seal_phot == null){
	System.out.println(this.toString+" : seal_phot is null" );
}else{
	System.out.println(this.toString+" : seal_phot is "+seal_phot );
}
String seal_file_size = req.getParameter("seal_file_size");
if( seal_file_size == null){
	System.out.println(this.toString+" : seal_file_size is null" );
}else{
	System.out.println(this.toString+" : seal_file_size is "+seal_file_size );
}
String ern_phot = req.getParameter("ern_phot");
if( ern_phot == null){
	System.out.println(this.toString+" : ern_phot is null" );
}else{
	System.out.println(this.toString+" : ern_phot is "+ern_phot );
}
String ern_file_size = req.getParameter("ern_file_size");
if( ern_file_size == null){
	System.out.println(this.toString+" : ern_file_size is null" );
}else{
	System.out.println(this.toString+" : ern_file_size is "+ern_file_size );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String clsf = Util.checkString(req.getParameter("clsf"));
String seal_phot = Util.checkString(req.getParameter("seal_phot"));
String seal_file_size = Util.checkString(req.getParameter("seal_file_size"));
String ern_phot = Util.checkString(req.getParameter("ern_phot"));
String ern_file_size = Util.checkString(req.getParameter("ern_file_size"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String seal_phot = Util.Uni2Ksc(Util.checkString(req.getParameter("seal_phot")));
String seal_file_size = Util.Uni2Ksc(Util.checkString(req.getParameter("seal_file_size")));
String ern_phot = Util.Uni2Ksc(Util.checkString(req.getParameter("ern_phot")));
String ern_file_size = Util.Uni2Ksc(Util.checkString(req.getParameter("ern_file_size")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setDlco_no(dlco_no);
dm.setClsf(clsf);
dm.setSeal_phot(seal_phot);
dm.setSeal_file_size(seal_file_size);
dm.setErn_phot(ern_phot);
dm.setErn_file_size(ern_file_size);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 29 16:45:09 KST 2013 */
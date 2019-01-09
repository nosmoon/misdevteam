/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class AD_BAS_1160_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_no;
	public String mode;
	public String seq;
	public String ewh_cnfm;
	public String owh_cnfm;
	public String incmg_pers;

	public AD_BAS_1160_UDM(){}
	public AD_BAS_1160_UDM(String cmpy_cd, String dlco_no, String mode, String seq, String ewh_cnfm, String owh_cnfm, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.mode = mode;
		this.seq = seq;
		this.ewh_cnfm = ewh_cnfm;
		this.owh_cnfm = owh_cnfm;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEwh_cnfm(String ewh_cnfm){
		this.ewh_cnfm = ewh_cnfm;
	}

	public void setOwh_cnfm(String owh_cnfm){
		this.owh_cnfm = owh_cnfm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEwh_cnfm(){
		return this.ewh_cnfm;
	}

	public String getOwh_cnfm(){
		return this.owh_cnfm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_BAS_1160_U( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1160_UDM dm = (AD_BAS_1160_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_no);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.ewh_cnfm);
		cstmt.setString(8, dm.owh_cnfm);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1160_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("mode = " + getMode());
        System.out.println("seq = " + getSeq());
        System.out.println("ewh_cnfm = " + getEwh_cnfm());
        System.out.println("owh_cnfm = " + getOwh_cnfm());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String ewh_cnfm = req.getParameter("ewh_cnfm");
if( ewh_cnfm == null){
	System.out.println(this.toString+" : ewh_cnfm is null" );
}else{
	System.out.println(this.toString+" : ewh_cnfm is "+ewh_cnfm );
}
String owh_cnfm = req.getParameter("owh_cnfm");
if( owh_cnfm == null){
	System.out.println(this.toString+" : owh_cnfm is null" );
}else{
	System.out.println(this.toString+" : owh_cnfm is "+owh_cnfm );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String ewh_cnfm = Util.checkString(req.getParameter("ewh_cnfm"));
String owh_cnfm = Util.checkString(req.getParameter("owh_cnfm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String ewh_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_cnfm")));
String owh_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_cnfm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setMode(mode);
dm.setSeq(seq);
dm.setEwh_cnfm(ewh_cnfm);
dm.setOwh_cnfm(owh_cnfm);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 17:59:12 KST 2009 */
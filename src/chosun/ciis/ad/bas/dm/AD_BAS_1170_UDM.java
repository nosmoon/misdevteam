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


public class AD_BAS_1170_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_no;
	public String mode;
	public String seq;
	public String repl_rtcn_cnfm2;
	public String repl_rtcn_cnfm3;
	public String incmg_pers;

	public AD_BAS_1170_UDM(){}
	public AD_BAS_1170_UDM(String cmpy_cd, String dlco_no, String mode, String seq, String repl_rtcn_cnfm2, String repl_rtcn_cnfm3, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.mode = mode;
		this.seq = seq;
		this.repl_rtcn_cnfm2 = repl_rtcn_cnfm2;
		this.repl_rtcn_cnfm3 = repl_rtcn_cnfm3;
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

	public void setRepl_rtcn_cnfm2(String repl_rtcn_cnfm2){
		this.repl_rtcn_cnfm2 = repl_rtcn_cnfm2;
	}

	public void setRepl_rtcn_cnfm3(String repl_rtcn_cnfm3){
		this.repl_rtcn_cnfm3 = repl_rtcn_cnfm3;
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

	public String getRepl_rtcn_cnfm2(){
		return this.repl_rtcn_cnfm2;
	}

	public String getRepl_rtcn_cnfm3(){
		return this.repl_rtcn_cnfm3;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_BAS_1170_U( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1170_UDM dm = (AD_BAS_1170_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_no);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.repl_rtcn_cnfm2);
		cstmt.setString(8, dm.repl_rtcn_cnfm3);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1170_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("mode = " + getMode());
        System.out.println("seq = " + getSeq());
        System.out.println("repl_rtcn_cnfm2 = " + getRepl_rtcn_cnfm2());
        System.out.println("repl_rtcn_cnfm3 = " + getRepl_rtcn_cnfm3());
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
String repl_rtcn_cnfm2 = req.getParameter("repl_rtcn_cnfm2");
if( repl_rtcn_cnfm2 == null){
	System.out.println(this.toString+" : repl_rtcn_cnfm2 is null" );
}else{
	System.out.println(this.toString+" : repl_rtcn_cnfm2 is "+repl_rtcn_cnfm2 );
}
String repl_rtcn_cnfm3 = req.getParameter("repl_rtcn_cnfm3");
if( repl_rtcn_cnfm3 == null){
	System.out.println(this.toString+" : repl_rtcn_cnfm3 is null" );
}else{
	System.out.println(this.toString+" : repl_rtcn_cnfm3 is "+repl_rtcn_cnfm3 );
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
String repl_rtcn_cnfm2 = Util.checkString(req.getParameter("repl_rtcn_cnfm2"));
String repl_rtcn_cnfm3 = Util.checkString(req.getParameter("repl_rtcn_cnfm3"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String repl_rtcn_cnfm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("repl_rtcn_cnfm2")));
String repl_rtcn_cnfm3 = Util.Uni2Ksc(Util.checkString(req.getParameter("repl_rtcn_cnfm3")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setMode(mode);
dm.setSeq(seq);
dm.setRepl_rtcn_cnfm2(repl_rtcn_cnfm2);
dm.setRepl_rtcn_cnfm3(repl_rtcn_cnfm3);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 18:00:56 KST 2009 */
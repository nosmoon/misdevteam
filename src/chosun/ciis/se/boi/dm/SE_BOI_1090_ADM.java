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


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1090_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String bo_cd;
	public String bo_seq;
	public String yymm;
	public String mode_ar;
	public String innexp_clsf_ar;
	public String innexp_ptcr_clsf_ar;
	public String innexp_amt_ar;
	public String mode2_ar;
	public String innexp_clsf2_ar;
	public String innexp_ptcr_clsf2_ar;
	public String innexp_amt2_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_1090_ADM(){}
	public SE_BOI_1090_ADM(String accflag, String cmpy_cd, String bo_cd, String bo_seq, String yymm, String mode_ar, String innexp_clsf_ar, String innexp_ptcr_clsf_ar, String innexp_amt_ar, String mode2_ar, String innexp_clsf2_ar, String innexp_ptcr_clsf2_ar, String innexp_amt2_ar, String incmg_pers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.yymm = yymm;
		this.mode_ar = mode_ar;
		this.innexp_clsf_ar = innexp_clsf_ar;
		this.innexp_ptcr_clsf_ar = innexp_ptcr_clsf_ar;
		this.innexp_amt_ar = innexp_amt_ar;
		this.mode2_ar = mode2_ar;
		this.innexp_clsf2_ar = innexp_clsf2_ar;
		this.innexp_ptcr_clsf2_ar = innexp_ptcr_clsf2_ar;
		this.innexp_amt2_ar = innexp_amt2_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setInnexp_clsf_ar(String innexp_clsf_ar){
		this.innexp_clsf_ar = innexp_clsf_ar;
	}

	public void setInnexp_ptcr_clsf_ar(String innexp_ptcr_clsf_ar){
		this.innexp_ptcr_clsf_ar = innexp_ptcr_clsf_ar;
	}

	public void setInnexp_amt_ar(String innexp_amt_ar){
		this.innexp_amt_ar = innexp_amt_ar;
	}

	public void setMode2_ar(String mode2_ar){
		this.mode2_ar = mode2_ar;
	}

	public void setInnexp_clsf2_ar(String innexp_clsf2_ar){
		this.innexp_clsf2_ar = innexp_clsf2_ar;
	}

	public void setInnexp_ptcr_clsf2_ar(String innexp_ptcr_clsf2_ar){
		this.innexp_ptcr_clsf2_ar = innexp_ptcr_clsf2_ar;
	}

	public void setInnexp_amt2_ar(String innexp_amt2_ar){
		this.innexp_amt2_ar = innexp_amt2_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getInnexp_clsf_ar(){
		return this.innexp_clsf_ar;
	}

	public String getInnexp_ptcr_clsf_ar(){
		return this.innexp_ptcr_clsf_ar;
	}

	public String getInnexp_amt_ar(){
		return this.innexp_amt_ar;
	}

	public String getMode2_ar(){
		return this.mode2_ar;
	}

	public String getInnexp_clsf2_ar(){
		return this.innexp_clsf2_ar;
	}

	public String getInnexp_ptcr_clsf2_ar(){
		return this.innexp_ptcr_clsf2_ar;
	}

	public String getInnexp_amt2_ar(){
		return this.innexp_amt2_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_1090_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1090_ADM dm = (SE_BOI_1090_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.bo_cd);
		cstmt.setString(6, dm.bo_seq);
		cstmt.setString(7, dm.yymm);
		cstmt.setString(8, dm.mode_ar);
		cstmt.setString(9, dm.innexp_clsf_ar);
		cstmt.setString(10, dm.innexp_ptcr_clsf_ar);
		cstmt.setString(11, dm.innexp_amt_ar);
		cstmt.setString(12, dm.mode2_ar);
		cstmt.setString(13, dm.innexp_clsf2_ar);
		cstmt.setString(14, dm.innexp_ptcr_clsf2_ar);
		cstmt.setString(15, dm.innexp_amt2_ar);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1090_ADataSet();
	}



    public void print(){
        System.out.println("accflag = " + getAccflag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("bo_seq = " + getBo_seq());
        System.out.println("yymm = " + getYymm());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("innexp_clsf_ar = " + getInnexp_clsf_ar());
        System.out.println("innexp_ptcr_clsf_ar = " + getInnexp_ptcr_clsf_ar());
        System.out.println("innexp_amt_ar = " + getInnexp_amt_ar());
        System.out.println("mode2_ar = " + getMode2_ar());
        System.out.println("innexp_clsf2_ar = " + getInnexp_clsf2_ar());
        System.out.println("innexp_ptcr_clsf2_ar = " + getInnexp_ptcr_clsf2_ar());
        System.out.println("innexp_amt2_ar = " + getInnexp_amt2_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String innexp_clsf_ar = req.getParameter("innexp_clsf_ar");
if( innexp_clsf_ar == null){
	System.out.println(this.toString+" : innexp_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : innexp_clsf_ar is "+innexp_clsf_ar );
}
String innexp_ptcr_clsf_ar = req.getParameter("innexp_ptcr_clsf_ar");
if( innexp_ptcr_clsf_ar == null){
	System.out.println(this.toString+" : innexp_ptcr_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : innexp_ptcr_clsf_ar is "+innexp_ptcr_clsf_ar );
}
String innexp_amt_ar = req.getParameter("innexp_amt_ar");
if( innexp_amt_ar == null){
	System.out.println(this.toString+" : innexp_amt_ar is null" );
}else{
	System.out.println(this.toString+" : innexp_amt_ar is "+innexp_amt_ar );
}
String mode2_ar = req.getParameter("mode2_ar");
if( mode2_ar == null){
	System.out.println(this.toString+" : mode2_ar is null" );
}else{
	System.out.println(this.toString+" : mode2_ar is "+mode2_ar );
}
String innexp_clsf2_ar = req.getParameter("innexp_clsf2_ar");
if( innexp_clsf2_ar == null){
	System.out.println(this.toString+" : innexp_clsf2_ar is null" );
}else{
	System.out.println(this.toString+" : innexp_clsf2_ar is "+innexp_clsf2_ar );
}
String innexp_ptcr_clsf2_ar = req.getParameter("innexp_ptcr_clsf2_ar");
if( innexp_ptcr_clsf2_ar == null){
	System.out.println(this.toString+" : innexp_ptcr_clsf2_ar is null" );
}else{
	System.out.println(this.toString+" : innexp_ptcr_clsf2_ar is "+innexp_ptcr_clsf2_ar );
}
String innexp_amt2_ar = req.getParameter("innexp_amt2_ar");
if( innexp_amt2_ar == null){
	System.out.println(this.toString+" : innexp_amt2_ar is null" );
}else{
	System.out.println(this.toString+" : innexp_amt2_ar is "+innexp_amt2_ar );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String yymm = Util.checkString(req.getParameter("yymm"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String innexp_clsf_ar = Util.checkString(req.getParameter("innexp_clsf_ar"));
String innexp_ptcr_clsf_ar = Util.checkString(req.getParameter("innexp_ptcr_clsf_ar"));
String innexp_amt_ar = Util.checkString(req.getParameter("innexp_amt_ar"));
String mode2_ar = Util.checkString(req.getParameter("mode2_ar"));
String innexp_clsf2_ar = Util.checkString(req.getParameter("innexp_clsf2_ar"));
String innexp_ptcr_clsf2_ar = Util.checkString(req.getParameter("innexp_ptcr_clsf2_ar"));
String innexp_amt2_ar = Util.checkString(req.getParameter("innexp_amt2_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String innexp_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("innexp_clsf_ar")));
String innexp_ptcr_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("innexp_ptcr_clsf_ar")));
String innexp_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("innexp_amt_ar")));
String mode2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode2_ar")));
String innexp_clsf2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("innexp_clsf2_ar")));
String innexp_ptcr_clsf2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("innexp_ptcr_clsf2_ar")));
String innexp_amt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("innexp_amt2_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setYymm(yymm);
dm.setMode_ar(mode_ar);
dm.setInnexp_clsf_ar(innexp_clsf_ar);
dm.setInnexp_ptcr_clsf_ar(innexp_ptcr_clsf_ar);
dm.setInnexp_amt_ar(innexp_amt_ar);
dm.setMode2_ar(mode2_ar);
dm.setInnexp_clsf2_ar(innexp_clsf2_ar);
dm.setInnexp_ptcr_clsf2_ar(innexp_ptcr_clsf2_ar);
dm.setInnexp_amt2_ar(innexp_amt2_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 28 15:15:09 KST 2009 */
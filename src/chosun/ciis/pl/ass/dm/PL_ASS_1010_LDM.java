/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.pl.ass.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.ass.ds.*;
import chosun.ciis.pl.ass.rec.*;

/**
 * 
 */


public class PL_ASS_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String medi_cd;
	public String medi_ser_no;
	public String ref_ser_no_1;
	public String ref_ser_no_2;
	public String basi_bgn_ser_no;
	public String basi_end_ser_no;
	public String prd;

	public PL_ASS_1010_LDM(){}
	public PL_ASS_1010_LDM(String cmpy_cd, String incmg_pers, String medi_cd, String medi_ser_no, String ref_ser_no_1, String ref_ser_no_2, String basi_bgn_ser_no, String basi_end_ser_no, String prd){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
		this.ref_ser_no_1 = ref_ser_no_1;
		this.ref_ser_no_2 = ref_ser_no_2;
		this.basi_bgn_ser_no = basi_bgn_ser_no;
		this.basi_end_ser_no = basi_end_ser_no;
		this.prd = prd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setRef_ser_no_1(String ref_ser_no_1){
		this.ref_ser_no_1 = ref_ser_no_1;
	}

	public void setRef_ser_no_2(String ref_ser_no_2){
		this.ref_ser_no_2 = ref_ser_no_2;
	}

	public void setBasi_bgn_ser_no(String basi_bgn_ser_no){
		this.basi_bgn_ser_no = basi_bgn_ser_no;
	}

	public void setBasi_end_ser_no(String basi_end_ser_no){
		this.basi_end_ser_no = basi_end_ser_no;
	}

	public void setPrd(String prd){
		this.prd = prd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getRef_ser_no_1(){
		return this.ref_ser_no_1;
	}

	public String getRef_ser_no_2(){
		return this.ref_ser_no_2;
	}

	public String getBasi_bgn_ser_no(){
		return this.basi_bgn_ser_no;
	}

	public String getBasi_end_ser_no(){
		return this.basi_end_ser_no;
	}

	public String getPrd(){
		return this.prd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_ASS_1010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_ASS_1010_LDM dm = (PL_ASS_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.medi_ser_no);
		cstmt.setString(7, dm.ref_ser_no_1);
		cstmt.setString(8, dm.ref_ser_no_2);
		cstmt.setString(9, dm.basi_bgn_ser_no);
		cstmt.setString(10, dm.basi_end_ser_no);
		cstmt.setString(11, dm.prd);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.ass.ds.PL_ASS_1010_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("medi_ser_no = " + getMedi_ser_no());
        System.out.println("ref_ser_no_1 = " + getRef_ser_no_1());
        System.out.println("ref_ser_no_2 = " + getRef_ser_no_2());
        System.out.println("basi_bgn_ser_no = " + getBasi_bgn_ser_no());
        System.out.println("basi_end_ser_no = " + getBasi_end_ser_no());
        System.out.println("prd = " + getPrd());
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_ser_no = req.getParameter("medi_ser_no");
if( medi_ser_no == null){
	System.out.println(this.toString+" : medi_ser_no is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no is "+medi_ser_no );
}
String ref_ser_no_1 = req.getParameter("ref_ser_no_1");
if( ref_ser_no_1 == null){
	System.out.println(this.toString+" : ref_ser_no_1 is null" );
}else{
	System.out.println(this.toString+" : ref_ser_no_1 is "+ref_ser_no_1 );
}
String ref_ser_no_2 = req.getParameter("ref_ser_no_2");
if( ref_ser_no_2 == null){
	System.out.println(this.toString+" : ref_ser_no_2 is null" );
}else{
	System.out.println(this.toString+" : ref_ser_no_2 is "+ref_ser_no_2 );
}
String basi_bgn_ser_no = req.getParameter("basi_bgn_ser_no");
if( basi_bgn_ser_no == null){
	System.out.println(this.toString+" : basi_bgn_ser_no is null" );
}else{
	System.out.println(this.toString+" : basi_bgn_ser_no is "+basi_bgn_ser_no );
}
String basi_end_ser_no = req.getParameter("basi_end_ser_no");
if( basi_end_ser_no == null){
	System.out.println(this.toString+" : basi_end_ser_no is null" );
}else{
	System.out.println(this.toString+" : basi_end_ser_no is "+basi_end_ser_no );
}
String prd = req.getParameter("prd");
if( prd == null){
	System.out.println(this.toString+" : prd is null" );
}else{
	System.out.println(this.toString+" : prd is "+prd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
String ref_ser_no_1 = Util.checkString(req.getParameter("ref_ser_no_1"));
String ref_ser_no_2 = Util.checkString(req.getParameter("ref_ser_no_2"));
String basi_bgn_ser_no = Util.checkString(req.getParameter("basi_bgn_ser_no"));
String basi_end_ser_no = Util.checkString(req.getParameter("basi_end_ser_no"));
String prd = Util.checkString(req.getParameter("prd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
String ref_ser_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_ser_no_1")));
String ref_ser_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_ser_no_2")));
String basi_bgn_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_bgn_ser_no")));
String basi_end_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_end_ser_no")));
String prd = Util.Uni2Ksc(Util.checkString(req.getParameter("prd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
dm.setRef_ser_no_1(ref_ser_no_1);
dm.setRef_ser_no_2(ref_ser_no_2);
dm.setBasi_bgn_ser_no(basi_bgn_ser_no);
dm.setBasi_end_ser_no(basi_end_ser_no);
dm.setPrd(prd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 20:13:04 KST 2009 */
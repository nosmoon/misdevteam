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


public class FC_ACCT_2511_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd;
	public String fisc_dt_fr;
	public String fisc_dt_to;
	public String mang_clsf_cd;
	public String slip_clsf_cd;
	public String comp_dt_fr;
	public String comp_dt_to;
	public String dr_amt;
	public String crdt_amt;
	public String drcr_clsf1;
	public String drcr_clsf2;
	public String kind;

	public FC_ACCT_2511_LDM(){}
	public FC_ACCT_2511_LDM(String cmpy_cd, String acct_cd, String fisc_dt_fr, String fisc_dt_to, String mang_clsf_cd, String slip_clsf_cd, String comp_dt_fr, String comp_dt_to, String dr_amt, String crdt_amt, String drcr_clsf1, String drcr_clsf2, String kind){
		this.cmpy_cd = cmpy_cd;
		this.acct_cd = acct_cd;
		this.fisc_dt_fr = fisc_dt_fr;
		this.fisc_dt_to = fisc_dt_to;
		this.mang_clsf_cd = mang_clsf_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.comp_dt_fr = comp_dt_fr;
		this.comp_dt_to = comp_dt_to;
		this.dr_amt = dr_amt;
		this.crdt_amt = crdt_amt;
		this.drcr_clsf1 = drcr_clsf1;
		this.drcr_clsf2 = drcr_clsf2;
		this.kind = kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setFisc_dt_fr(String fisc_dt_fr){
		this.fisc_dt_fr = fisc_dt_fr;
	}

	public void setFisc_dt_to(String fisc_dt_to){
		this.fisc_dt_to = fisc_dt_to;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setComp_dt_fr(String comp_dt_fr){
		this.comp_dt_fr = comp_dt_fr;
	}

	public void setComp_dt_to(String comp_dt_to){
		this.comp_dt_to = comp_dt_to;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setDrcr_clsf1(String drcr_clsf1){
		this.drcr_clsf1 = drcr_clsf1;
	}

	public void setDrcr_clsf2(String drcr_clsf2){
		this.drcr_clsf2 = drcr_clsf2;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getFisc_dt_fr(){
		return this.fisc_dt_fr;
	}

	public String getFisc_dt_to(){
		return this.fisc_dt_to;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getComp_dt_fr(){
		return this.comp_dt_fr;
	}

	public String getComp_dt_to(){
		return this.comp_dt_to;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getDrcr_clsf1(){
		return this.drcr_clsf1;
	}

	public String getDrcr_clsf2(){
		return this.drcr_clsf2;
	}

	public String getKind(){
		return this.kind;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2511_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2511_LDM dm = (FC_ACCT_2511_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_cd);
		cstmt.setString(5, dm.fisc_dt_fr);
		cstmt.setString(6, dm.fisc_dt_to);
		cstmt.setString(7, dm.mang_clsf_cd);
		cstmt.setString(8, dm.slip_clsf_cd);
		cstmt.setString(9, dm.comp_dt_fr);
		cstmt.setString(10, dm.comp_dt_to);
		cstmt.setString(11, dm.dr_amt);
		cstmt.setString(12, dm.crdt_amt);
		cstmt.setString(13, dm.drcr_clsf1);
		cstmt.setString(14, dm.drcr_clsf2);
		cstmt.setString(15, dm.kind);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2511_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("acct_cd = " + getAcct_cd());
        System.out.println("fisc_dt_fr = " + getFisc_dt_fr());
        System.out.println("fisc_dt_to = " + getFisc_dt_to());
        System.out.println("mang_clsf_cd = " + getMang_clsf_cd());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("comp_dt_fr = " + getComp_dt_fr());
        System.out.println("comp_dt_to = " + getComp_dt_to());
        System.out.println("dr_amt = " + getDr_amt());
        System.out.println("crdt_amt = " + getCrdt_amt());
        System.out.println("drcr_clsf1 = " + getDrcr_clsf1());
        System.out.println("drcr_clsf2 = " + getDrcr_clsf2());
        System.out.println("kind = " + getKind());
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
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String fisc_dt_fr = req.getParameter("fisc_dt_fr");
if( fisc_dt_fr == null){
	System.out.println(this.toString+" : fisc_dt_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_fr is "+fisc_dt_fr );
}
String fisc_dt_to = req.getParameter("fisc_dt_to");
if( fisc_dt_to == null){
	System.out.println(this.toString+" : fisc_dt_to is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_to is "+fisc_dt_to );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String comp_dt_fr = req.getParameter("comp_dt_fr");
if( comp_dt_fr == null){
	System.out.println(this.toString+" : comp_dt_fr is null" );
}else{
	System.out.println(this.toString+" : comp_dt_fr is "+comp_dt_fr );
}
String comp_dt_to = req.getParameter("comp_dt_to");
if( comp_dt_to == null){
	System.out.println(this.toString+" : comp_dt_to is null" );
}else{
	System.out.println(this.toString+" : comp_dt_to is "+comp_dt_to );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
}
String crdt_amt = req.getParameter("crdt_amt");
if( crdt_amt == null){
	System.out.println(this.toString+" : crdt_amt is null" );
}else{
	System.out.println(this.toString+" : crdt_amt is "+crdt_amt );
}
String drcr_clsf1 = req.getParameter("drcr_clsf1");
if( drcr_clsf1 == null){
	System.out.println(this.toString+" : drcr_clsf1 is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf1 is "+drcr_clsf1 );
}
String drcr_clsf2 = req.getParameter("drcr_clsf2");
if( drcr_clsf2 == null){
	System.out.println(this.toString+" : drcr_clsf2 is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf2 is "+drcr_clsf2 );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
String fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String comp_dt_fr = Util.checkString(req.getParameter("comp_dt_fr"));
String comp_dt_to = Util.checkString(req.getParameter("comp_dt_to"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
String drcr_clsf1 = Util.checkString(req.getParameter("drcr_clsf1"));
String drcr_clsf2 = Util.checkString(req.getParameter("drcr_clsf2"));
String kind = Util.checkString(req.getParameter("kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String fisc_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_fr")));
String fisc_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_to")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String comp_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt_fr")));
String comp_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt_to")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_amt")));
String drcr_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf1")));
String drcr_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf2")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd(acct_cd);
dm.setFisc_dt_fr(fisc_dt_fr);
dm.setFisc_dt_to(fisc_dt_to);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setComp_dt_fr(comp_dt_fr);
dm.setComp_dt_to(comp_dt_to);
dm.setDr_amt(dr_amt);
dm.setCrdt_amt(crdt_amt);
dm.setDrcr_clsf1(drcr_clsf1);
dm.setDrcr_clsf2(drcr_clsf2);
dm.setKind(kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 11 16:20:15 KST 2009 */
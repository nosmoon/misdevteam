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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_5011_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String certi_clsf;
	public String occr_dt;
	public String seq;
	public String aplc_dt;
	public String issu_num_shet;
	public String usag;
	public String remk;
	public String cntc_plac;
	public String email;
	public String engl_flnm;
	public String u_id;
	public String u_ipadd;

	public HD_AFFR_5011_ADM(){}
	public HD_AFFR_5011_ADM(String mode, String cmpy_cd, String emp_no, String certi_clsf, String occr_dt, String seq, String aplc_dt, String issu_num_shet, String usag, String remk, String cntc_plac, String email, String engl_flnm, String u_id, String u_ipadd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.certi_clsf = certi_clsf;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.aplc_dt = aplc_dt;
		this.issu_num_shet = issu_num_shet;
		this.usag = usag;
		this.remk = remk;
		this.cntc_plac = cntc_plac;
		this.email = email;
		this.engl_flnm = engl_flnm;
		this.u_id = u_id;
		this.u_ipadd = u_ipadd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCerti_clsf(String certi_clsf){
		this.certi_clsf = certi_clsf;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setIssu_num_shet(String issu_num_shet){
		this.issu_num_shet = issu_num_shet;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setEngl_flnm(String engl_flnm){
		this.engl_flnm = engl_flnm;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCerti_clsf(){
		return this.certi_clsf;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getIssu_num_shet(){
		return this.issu_num_shet;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getEmail(){
		return this.email;
	}

	public String getEngl_flnm(){
		return this.engl_flnm;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_5011_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_5011_ADM dm = (HD_AFFR_5011_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.certi_clsf);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.aplc_dt);
		cstmt.setString(10, dm.issu_num_shet);
		cstmt.setString(11, dm.usag);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.cntc_plac);
		cstmt.setString(14, dm.email);
		cstmt.setString(15, dm.engl_flnm);
		cstmt.setString(16, dm.u_id);
		cstmt.setString(17, dm.u_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_5011_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("certi_clsf = " + getCerti_clsf());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("aplc_dt = " + getAplc_dt());
        System.out.println("issu_num_shet = " + getIssu_num_shet());
        System.out.println("usag = " + getUsag());
        System.out.println("remk = " + getRemk());
        System.out.println("cntc_plac = " + getCntc_plac());
        System.out.println("email = " + getEmail());
        System.out.println("engl_flnm = " + getEngl_flnm());
        System.out.println("u_id = " + getU_id());
        System.out.println("u_ipadd = " + getU_ipadd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String certi_clsf = req.getParameter("certi_clsf");
if( certi_clsf == null){
	System.out.println(this.toString+" : certi_clsf is null" );
}else{
	System.out.println(this.toString+" : certi_clsf is "+certi_clsf );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
}
String issu_num_shet = req.getParameter("issu_num_shet");
if( issu_num_shet == null){
	System.out.println(this.toString+" : issu_num_shet is null" );
}else{
	System.out.println(this.toString+" : issu_num_shet is "+issu_num_shet );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String cntc_plac = req.getParameter("cntc_plac");
if( cntc_plac == null){
	System.out.println(this.toString+" : cntc_plac is null" );
}else{
	System.out.println(this.toString+" : cntc_plac is "+cntc_plac );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String engl_flnm = req.getParameter("engl_flnm");
if( engl_flnm == null){
	System.out.println(this.toString+" : engl_flnm is null" );
}else{
	System.out.println(this.toString+" : engl_flnm is "+engl_flnm );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String issu_num_shet = Util.checkString(req.getParameter("issu_num_shet"));
String usag = Util.checkString(req.getParameter("usag"));
String remk = Util.checkString(req.getParameter("remk"));
String cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
String email = Util.checkString(req.getParameter("email"));
String engl_flnm = Util.checkString(req.getParameter("engl_flnm"));
String u_id = Util.checkString(req.getParameter("u_id"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String certi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("certi_clsf")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String issu_num_shet = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_num_shet")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_plac")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String engl_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_flnm")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setCerti_clsf(certi_clsf);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setAplc_dt(aplc_dt);
dm.setIssu_num_shet(issu_num_shet);
dm.setUsag(usag);
dm.setRemk(remk);
dm.setCntc_plac(cntc_plac);
dm.setEmail(email);
dm.setEngl_flnm(engl_flnm);
dm.setU_id(u_id);
dm.setU_ipadd(u_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 15:22:05 KST 2009 */
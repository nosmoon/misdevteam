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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1510_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String matr_cd;
	public String medi_cd;
	public String sect_cd;
	public String qunt;
	public String matr_cd2;
	public String medi_cd2;
	public String sect_cd2;
	public String qunt2;
	public String issu_dt2;
	public String fac_clsf2;
	public String ink_clsf3;
	public String medi_cd3;
	public String sect_cd3;
	public String bgn_gage3;
	public String end_gage3;
	public String qunt3;
	public String issu_dt3;
	public String fac_clsf3;
	public String pers_ipaddr;
	public String pers_id;

	public MT_SUBMATROUT_1510_ADM(){}
	public MT_SUBMATROUT_1510_ADM(String cmpy_cd, String occr_dt, String seq, String sub_seq, String matr_cd, String medi_cd, String sect_cd, String qunt, String matr_cd2, String medi_cd2, String sect_cd2, String qunt2, String issu_dt2, String fac_clsf2, String ink_clsf3, String medi_cd3, String sect_cd3, String bgn_gage3, String end_gage3, String qunt3, String issu_dt3, String fac_clsf3, String pers_ipaddr, String pers_id){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.matr_cd = matr_cd;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.qunt = qunt;
		this.matr_cd2 = matr_cd2;
		this.medi_cd2 = medi_cd2;
		this.sect_cd2 = sect_cd2;
		this.qunt2 = qunt2;
		this.issu_dt2 = issu_dt2;
		this.fac_clsf2 = fac_clsf2;
		this.ink_clsf3 = ink_clsf3;
		this.medi_cd3 = medi_cd3;
		this.sect_cd3 = sect_cd3;
		this.bgn_gage3 = bgn_gage3;
		this.end_gage3 = end_gage3;
		this.qunt3 = qunt3;
		this.issu_dt3 = issu_dt3;
		this.fac_clsf3 = fac_clsf3;
		this.pers_ipaddr = pers_ipaddr;
		this.pers_id = pers_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setMatr_cd2(String matr_cd2){
		this.matr_cd2 = matr_cd2;
	}

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setSect_cd2(String sect_cd2){
		this.sect_cd2 = sect_cd2;
	}

	public void setQunt2(String qunt2){
		this.qunt2 = qunt2;
	}

	public void setIssu_dt2(String issu_dt2){
		this.issu_dt2 = issu_dt2;
	}

	public void setFac_clsf2(String fac_clsf2){
		this.fac_clsf2 = fac_clsf2;
	}

	public void setInk_clsf3(String ink_clsf3){
		this.ink_clsf3 = ink_clsf3;
	}

	public void setMedi_cd3(String medi_cd3){
		this.medi_cd3 = medi_cd3;
	}

	public void setSect_cd3(String sect_cd3){
		this.sect_cd3 = sect_cd3;
	}

	public void setBgn_gage3(String bgn_gage3){
		this.bgn_gage3 = bgn_gage3;
	}

	public void setEnd_gage3(String end_gage3){
		this.end_gage3 = end_gage3;
	}

	public void setQunt3(String qunt3){
		this.qunt3 = qunt3;
	}

	public void setIssu_dt3(String issu_dt3){
		this.issu_dt3 = issu_dt3;
	}

	public void setFac_clsf3(String fac_clsf3){
		this.fac_clsf3 = fac_clsf3;
	}

	public void setPers_ipaddr(String pers_ipaddr){
		this.pers_ipaddr = pers_ipaddr;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getMatr_cd2(){
		return this.matr_cd2;
	}

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getSect_cd2(){
		return this.sect_cd2;
	}

	public String getQunt2(){
		return this.qunt2;
	}

	public String getIssu_dt2(){
		return this.issu_dt2;
	}

	public String getFac_clsf2(){
		return this.fac_clsf2;
	}

	public String getInk_clsf3(){
		return this.ink_clsf3;
	}

	public String getMedi_cd3(){
		return this.medi_cd3;
	}

	public String getSect_cd3(){
		return this.sect_cd3;
	}

	public String getBgn_gage3(){
		return this.bgn_gage3;
	}

	public String getEnd_gage3(){
		return this.end_gage3;
	}

	public String getQunt3(){
		return this.qunt3;
	}

	public String getIssu_dt3(){
		return this.issu_dt3;
	}

	public String getFac_clsf3(){
		return this.fac_clsf3;
	}

	public String getPers_ipaddr(){
		return this.pers_ipaddr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1510_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1510_ADM dm = (MT_SUBMATROUT_1510_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.sub_seq);
		cstmt.setString(7, dm.matr_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.sect_cd);
		cstmt.setString(10, dm.qunt);
		cstmt.setString(11, dm.matr_cd2);
		cstmt.setString(12, dm.medi_cd2);
		cstmt.setString(13, dm.sect_cd2);
		cstmt.setString(14, dm.qunt2);
		cstmt.setString(15, dm.issu_dt2);
		cstmt.setString(16, dm.fac_clsf2);
		cstmt.setString(17, dm.ink_clsf3);
		cstmt.setString(18, dm.medi_cd3);
		cstmt.setString(19, dm.sect_cd3);
		cstmt.setString(20, dm.bgn_gage3);
		cstmt.setString(21, dm.end_gage3);
		cstmt.setString(22, dm.qunt3);
		cstmt.setString(23, dm.issu_dt3);
		cstmt.setString(24, dm.fac_clsf3);
		cstmt.setString(25, dm.pers_ipaddr);
		cstmt.setString(26, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1510_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("matr_cd2 = [" + getMatr_cd2() + "]");
		System.out.println("medi_cd2 = [" + getMedi_cd2() + "]");
		System.out.println("sect_cd2 = [" + getSect_cd2() + "]");
		System.out.println("qunt2 = [" + getQunt2() + "]");
		System.out.println("issu_dt2 = [" + getIssu_dt2() + "]");
		System.out.println("fac_clsf2 = [" + getFac_clsf2() + "]");
		System.out.println("ink_clsf3 = [" + getInk_clsf3() + "]");
		System.out.println("medi_cd3 = [" + getMedi_cd3() + "]");
		System.out.println("sect_cd3 = [" + getSect_cd3() + "]");
		System.out.println("bgn_gage3 = [" + getBgn_gage3() + "]");
		System.out.println("end_gage3 = [" + getEnd_gage3() + "]");
		System.out.println("qunt3 = [" + getQunt3() + "]");
		System.out.println("issu_dt3 = [" + getIssu_dt3() + "]");
		System.out.println("fac_clsf3 = [" + getFac_clsf3() + "]");
		System.out.println("pers_ipaddr = [" + getPers_ipaddr() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
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
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String matr_cd2 = req.getParameter("matr_cd2");
if( matr_cd2 == null){
	System.out.println(this.toString+" : matr_cd2 is null" );
}else{
	System.out.println(this.toString+" : matr_cd2 is "+matr_cd2 );
}
String medi_cd2 = req.getParameter("medi_cd2");
if( medi_cd2 == null){
	System.out.println(this.toString+" : medi_cd2 is null" );
}else{
	System.out.println(this.toString+" : medi_cd2 is "+medi_cd2 );
}
String sect_cd2 = req.getParameter("sect_cd2");
if( sect_cd2 == null){
	System.out.println(this.toString+" : sect_cd2 is null" );
}else{
	System.out.println(this.toString+" : sect_cd2 is "+sect_cd2 );
}
String qunt2 = req.getParameter("qunt2");
if( qunt2 == null){
	System.out.println(this.toString+" : qunt2 is null" );
}else{
	System.out.println(this.toString+" : qunt2 is "+qunt2 );
}
String issu_dt2 = req.getParameter("issu_dt2");
if( issu_dt2 == null){
	System.out.println(this.toString+" : issu_dt2 is null" );
}else{
	System.out.println(this.toString+" : issu_dt2 is "+issu_dt2 );
}
String fac_clsf2 = req.getParameter("fac_clsf2");
if( fac_clsf2 == null){
	System.out.println(this.toString+" : fac_clsf2 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf2 is "+fac_clsf2 );
}
String ink_clsf3 = req.getParameter("ink_clsf3");
if( ink_clsf3 == null){
	System.out.println(this.toString+" : ink_clsf3 is null" );
}else{
	System.out.println(this.toString+" : ink_clsf3 is "+ink_clsf3 );
}
String medi_cd3 = req.getParameter("medi_cd3");
if( medi_cd3 == null){
	System.out.println(this.toString+" : medi_cd3 is null" );
}else{
	System.out.println(this.toString+" : medi_cd3 is "+medi_cd3 );
}
String sect_cd3 = req.getParameter("sect_cd3");
if( sect_cd3 == null){
	System.out.println(this.toString+" : sect_cd3 is null" );
}else{
	System.out.println(this.toString+" : sect_cd3 is "+sect_cd3 );
}
String bgn_gage3 = req.getParameter("bgn_gage3");
if( bgn_gage3 == null){
	System.out.println(this.toString+" : bgn_gage3 is null" );
}else{
	System.out.println(this.toString+" : bgn_gage3 is "+bgn_gage3 );
}
String end_gage3 = req.getParameter("end_gage3");
if( end_gage3 == null){
	System.out.println(this.toString+" : end_gage3 is null" );
}else{
	System.out.println(this.toString+" : end_gage3 is "+end_gage3 );
}
String qunt3 = req.getParameter("qunt3");
if( qunt3 == null){
	System.out.println(this.toString+" : qunt3 is null" );
}else{
	System.out.println(this.toString+" : qunt3 is "+qunt3 );
}
String issu_dt3 = req.getParameter("issu_dt3");
if( issu_dt3 == null){
	System.out.println(this.toString+" : issu_dt3 is null" );
}else{
	System.out.println(this.toString+" : issu_dt3 is "+issu_dt3 );
}
String fac_clsf3 = req.getParameter("fac_clsf3");
if( fac_clsf3 == null){
	System.out.println(this.toString+" : fac_clsf3 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf3 is "+fac_clsf3 );
}
String pers_ipaddr = req.getParameter("pers_ipaddr");
if( pers_ipaddr == null){
	System.out.println(this.toString+" : pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : pers_ipaddr is "+pers_ipaddr );
}
String pers_id = req.getParameter("pers_id");
if( pers_id == null){
	System.out.println(this.toString+" : pers_id is null" );
}else{
	System.out.println(this.toString+" : pers_id is "+pers_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String qunt = Util.checkString(req.getParameter("qunt"));
String matr_cd2 = Util.checkString(req.getParameter("matr_cd2"));
String medi_cd2 = Util.checkString(req.getParameter("medi_cd2"));
String sect_cd2 = Util.checkString(req.getParameter("sect_cd2"));
String qunt2 = Util.checkString(req.getParameter("qunt2"));
String issu_dt2 = Util.checkString(req.getParameter("issu_dt2"));
String fac_clsf2 = Util.checkString(req.getParameter("fac_clsf2"));
String ink_clsf3 = Util.checkString(req.getParameter("ink_clsf3"));
String medi_cd3 = Util.checkString(req.getParameter("medi_cd3"));
String sect_cd3 = Util.checkString(req.getParameter("sect_cd3"));
String bgn_gage3 = Util.checkString(req.getParameter("bgn_gage3"));
String end_gage3 = Util.checkString(req.getParameter("end_gage3"));
String qunt3 = Util.checkString(req.getParameter("qunt3"));
String issu_dt3 = Util.checkString(req.getParameter("issu_dt3"));
String fac_clsf3 = Util.checkString(req.getParameter("fac_clsf3"));
String pers_ipaddr = Util.checkString(req.getParameter("pers_ipaddr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String matr_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd2")));
String medi_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd2")));
String sect_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd2")));
String qunt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt2")));
String issu_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt2")));
String fac_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf2")));
String ink_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ink_clsf3")));
String medi_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd3")));
String sect_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd3")));
String bgn_gage3 = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_gage3")));
String end_gage3 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_gage3")));
String qunt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt3")));
String issu_dt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt3")));
String fac_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf3")));
String pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipaddr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setMatr_cd(matr_cd);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setQunt(qunt);
dm.setMatr_cd2(matr_cd2);
dm.setMedi_cd2(medi_cd2);
dm.setSect_cd2(sect_cd2);
dm.setQunt2(qunt2);
dm.setIssu_dt2(issu_dt2);
dm.setFac_clsf2(fac_clsf2);
dm.setInk_clsf3(ink_clsf3);
dm.setMedi_cd3(medi_cd3);
dm.setSect_cd3(sect_cd3);
dm.setBgn_gage3(bgn_gage3);
dm.setEnd_gage3(end_gage3);
dm.setQunt3(qunt3);
dm.setIssu_dt3(issu_dt3);
dm.setFac_clsf3(fac_clsf3);
dm.setPers_ipaddr(pers_ipaddr);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 07 12:01:04 KST 2009 */
/***************************************************************************************************
* 파일명 : SE_SND_1940_ADM.java
* 기능 : 판매 - 발송관리 - 발송마스터
* 작성일자 : 2009.02.11
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1940_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd               ;
	public String flag					;
	public String bo_cd                 ;
	public String send_plac_seq         ;
	public String send_plac_nm          ;
	public String area_cd               ;
	public String bo_seq                ;
	public String send_plac_feat_clas   ;
	public String ariv_nomn             ;
	public String band                  ;
	public String enclo_bo_cd           ;
	public String enclo_bo_seq          ;
	public String stetsell_clsf         ;
	public String clas_clsf             ;
	public String etc_area_clas         ;
	public String use_yn                ;
	public String mode					;
	public String route_clsf            ;
	public String route_cd              ;
	public String route_nm              ;
	public String route_rank            ;
	public String send_rank             ;
	public String cnsg_seqo             ;
	public String use_yn_route			;
	public String incmg_pers_ip			;
	public String incmg_pers			;
	
	public SE_SND_1940_ADM(){}
	
	public SE_SND_1940_ADM(String cmpy_cd, String flag, String bo_cd, String send_plac_seq, String send_plac_nm, String area_cd, String bo_seq, String send_plac_feat_clas, String ariv_nomn, String band, String enclo_bo_cd, String enclo_bo_seq, String stetsell_clsf, String clas_clsf, String etc_area_clas, String use_yn, String mode, String route_clsf, String route_cd, String route_nm, String route_rank, String send_rank, String cnsg_seqo, String use_yn_route, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd              = cmpy_cd             ;
		this.flag				  = flag				;
		this.bo_cd                = bo_cd               ;
		this.send_plac_seq        = send_plac_seq       ;
		this.send_plac_nm         = send_plac_nm        ;
		this.area_cd              = area_cd             ;
		this.bo_seq               = bo_seq              ;
		this.send_plac_feat_clas  = send_plac_feat_clas ;
		this.ariv_nomn            = ariv_nomn           ;
		this.band                 = band                ;
		this.enclo_bo_cd          = enclo_bo_cd         ;
		this.enclo_bo_seq         = enclo_bo_seq        ;
		this.stetsell_clsf        = stetsell_clsf       ;
		this.clas_clsf            = clas_clsf           ;
		this.etc_area_clas		  = etc_area_clas		;
		this.use_yn               = use_yn              ;
		this.mode				  = mode				;
		this.route_clsf           = route_clsf          ;
		this.route_cd             = route_cd            ;
		this.route_nm             = route_nm            ;
		this.route_rank           = route_rank          ;
		this.send_rank            = send_rank           ;
		this.cnsg_seqo            = cnsg_seqo           ;
		this.use_yn_route		  = use_yn_route		;
		this.incmg_pers_ip		  = incmg_pers_ip		;
		this.incmg_pers			  = incmg_pers			;
	}
	
	
	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1940_ADataSet();
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1940_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1940_ADM dm = (SE_SND_1940_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd				  );
		cstmt.setString( 4, dm.flag					  );
		cstmt.setString( 5, dm.bo_cd                  );
		cstmt.setString( 6, dm.send_plac_seq          );
		cstmt.setString( 7, dm.send_plac_nm           );
		cstmt.setString( 8, dm.area_cd                );
		cstmt.setString( 9, dm.bo_seq                 );
		cstmt.setString(10, dm.send_plac_feat_clas    );
		cstmt.setString(11, dm.ariv_nomn              );
		cstmt.setString(12, dm.band                   );
		cstmt.setString(13, dm.enclo_bo_cd            );
		cstmt.setString(14, dm.enclo_bo_seq           );
		cstmt.setString(15, dm.stetsell_clsf          );
		cstmt.setString(16, dm.clas_clsf              );
		cstmt.setString(17, dm.etc_area_clas		  );
		cstmt.setString(18, dm.use_yn                 );
		cstmt.setString(19, dm.mode	                  );
		cstmt.setString(20, dm.route_clsf             );
		cstmt.setString(21, dm.route_cd               );
		cstmt.setString(22, dm.route_nm               );
		cstmt.setString(23, dm.route_rank             );
		cstmt.setString(24, dm.send_rank              );
		cstmt.setString(25, dm.cnsg_seqo              );
		cstmt.setString(26, dm.use_yn_route           );
		cstmt.setString(27, dm.incmg_pers_ip          );
		cstmt.setString(28, dm.incmg_pers			  );
	}

	public String getArea_cd() {
		return area_cd;
	}

	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}

	public String getAriv_nomn() {
		return ariv_nomn;
	}

	public void setAriv_nomn(String ariv_nomn) {
		this.ariv_nomn = ariv_nomn;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public String getBo_cd() {
		return bo_cd;
	}

	public void setBo_cd(String bo_cd) {
		this.bo_cd = bo_cd;
	}

	public String getBo_seq() {
		return bo_seq;
	}

	public void setBo_seq(String bo_seq) {
		this.bo_seq = bo_seq;
	}

	public String getClas_clsf() {
		return clas_clsf;
	}

	public void setClas_clsf(String clas_clsf) {
		this.clas_clsf = clas_clsf;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getCnsg_seqo() {
		return cnsg_seqo;
	}

	public void setCnsg_seqo(String cnsg_seqo) {
		this.cnsg_seqo = cnsg_seqo;
	}

	public String getEnclo_bo_cd() {
		return enclo_bo_cd;
	}

	public void setEnclo_bo_cd(String enclo_bo_cd) {
		this.enclo_bo_cd = enclo_bo_cd;
	}

	public String getEnclo_bo_seq() {
		return enclo_bo_seq;
	}

	public void setEnclo_bo_seq(String enclo_bo_seq) {
		this.enclo_bo_seq = enclo_bo_seq;
	}

	public String getRoute_cd() {
		return route_cd;
	}

	public void setRoute_cd(String route_cd) {
		this.route_cd = route_cd;
	}

	public String getRoute_clsf() {
		return route_clsf;
	}

	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}

	public String getRoute_nm() {
		return route_nm;
	}

	public void setRoute_nm(String route_nm) {
		this.route_nm = route_nm;
	}

	public String getRoute_rank() {
		return route_rank;
	}

	public void setRoute_rank(String route_rank) {
		this.route_rank = route_rank;
	}

	public String getSend_plac_feat_clas() {
		return send_plac_feat_clas;
	}

	public void setSend_plac_feat_clas(String send_plac_feat_clas) {
		this.send_plac_feat_clas = send_plac_feat_clas;
	}

	public String getSend_plac_nm() {
		return send_plac_nm;
	}

	public void setSend_plac_nm(String send_plac_nm) {
		this.send_plac_nm = send_plac_nm;
	}

	public String getSend_plac_seq() {
		return send_plac_seq;
	}

	public void setSend_plac_seq(String send_plac_seq) {
		this.send_plac_seq = send_plac_seq;
	}

	public String getSend_rank() {
		return send_rank;
	}

	public void setSend_rank(String send_rank) {
		this.send_rank = send_rank;
	}

	public String getStetsell_clsf() {
		return stetsell_clsf;
	}

	public void setStetsell_clsf(String stetsell_clsf) {
		this.stetsell_clsf = stetsell_clsf;
	}

	public String getUse_yn() {
		return use_yn;
	}

	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}

	public String getUse_yn_route() {
		return use_yn_route;
	}

	public void setUse_yn_route(String use_yn_route) {
		this.use_yn_route = use_yn_route;
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
	
	public void print(){
		System.out.println("cmpy_cd              =" + getCmpy_cd            ());
		System.out.println("flag 	             =" + getFlag               ());
		System.out.println("bo_cd                =" + getBo_cd              ());
		System.out.println("send_plac_seq        =" + getSend_plac_seq      ());
		System.out.println("send_plac_nm         =" + getSend_plac_nm       ());
		System.out.println("area_cd              =" + getArea_cd            ());
		System.out.println("bo_seq               =" + getBo_seq             ());
		System.out.println("send_plac_feat_clas  =" + getSend_plac_feat_clas());
		System.out.println("ariv_nomn            =" + getAriv_nomn          ());
		System.out.println("band                 =" + getBand               ());
		System.out.println("enclo_bo_cd          =" + getEnclo_bo_cd        ());
		System.out.println("enclo_bo_seq         =" + getEnclo_bo_seq       ());
		System.out.println("stetsell_clsf        =" + getStetsell_clsf      ());
		System.out.println("clas_clsf            =" + getClas_clsf          ());
		System.out.println("etc_area_clas 		 =" + getEtc_area_clas 		());
		System.out.println("use_yn               =" + getUse_yn             ());
		System.out.println("mode        	     =" + getMode	            ());
		System.out.println("route_clsf           =" + getRoute_clsf         ());
		System.out.println("route_cd             =" + getRoute_cd           ());
		System.out.println("route_nm             =" + getRoute_nm           ());
		System.out.println("route_rank           =" + getRoute_rank         ());
		System.out.println("send_rank            =" + getSend_rank          ());
		System.out.println("cnsg_seqo            =" + getCnsg_seqo          ());
		System.out.println("use_yn_route		 =" + getUse_yn_route		());
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getEtc_area_clas() {
		return etc_area_clas;
	}

	public void setEtc_area_clas(String etc_area_clas) {
		this.etc_area_clas = etc_area_clas;
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String cd_clsf = req.getParameter("cd_clsf");
if( cd_clsf == null){
	System.out.println(this.toString+" : cd_clsf is null" );
}else{
	System.out.println(this.toString+" : cd_clsf is "+cd_clsf );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cd_nm = req.getParameter("cd_nm");
if( cd_nm == null){
	System.out.println(this.toString+" : cd_nm is null" );
}else{
	System.out.println(this.toString+" : cd_nm is "+cd_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
String cd = Util.checkString(req.getParameter("cd"));
String cd_nm = Util.checkString(req.getParameter("cd_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_clsf")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCd_clsf(cd_clsf);
dm.setCd(cd);
dm.setCd_nm(cd_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 19 15:55:59 KST 2009 */
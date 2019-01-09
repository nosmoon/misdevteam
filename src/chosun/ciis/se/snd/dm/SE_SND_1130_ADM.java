/***************************************************************************************************
* 파일명 : SE_SND_1130_ADM.java
* 기능 : 판매 - 발송관리 - 노선등록
 * 작성일자 : 2009.02.03
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
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_SND_1130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd       	;
	public String inwsp_send_yn    	;
	public String mode				;
	public String route_clsf		;
	public String route_cd			;
	public String route_nm			;
	public String route_rank		;
	public String medi_cd			;
	public String prt_plac_cd		;
	public String ecnt_cd			;
	public String ledt_cd			; 
	public String mode_send			;
	public String bo_cd				;
	public String send_plac_seq		;
	public String send_rank			;
	public String cnsg_seqo			;
	public String send_mthd			;
	public String incmg_pers_ip 	;
	public String incmg_pers    	;

	public SE_SND_1130_ADM(){}
	public SE_SND_1130_ADM(String cmpy_cd, String inwsp_send_yn, String mode, String route_clsf, String route_cd, String route_nm, String route_rank, String medi_cd, String prt_plac_cd, String ecnt_cd, String ledt_cd, String mode_send, String bo_cd, String send_plac_seq, String send_rank, String cnsg_seqo, String send_mthd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd          	= cmpy_cd         	;
		this.inwsp_send_yn		= inwsp_send_yn		;
		this.mode				= mode				;
		this.route_clsf		    = route_clsf		;
		this.route_cd			= route_cd			;
		this.route_rank			= route_rank		;
		this.medi_cd			= medi_cd			;
		this.prt_plac_cd	    = prt_plac_cd	    ;
		this.ecnt_cd			= ecnt_cd			;
		this.ledt_cd			= ledt_cd			;
		this.mode_send		    = mode_send		    ;
		this.bo_cd				= bo_cd				;
		this.send_plac_seq	    = send_plac_seq	  	;
		this.send_rank			= send_rank			;
		this.cnsg_seqo			= cnsg_seqo			;
		this.send_mthd			= send_mthd			;
		this.incmg_pers_ip 	  	= incmg_pers_ip 	;
		this.incmg_pers    		= incmg_pers    	;
	}
	
	public String getBo_cd() {
		return bo_cd;
	}
	public void setBo_cd(String bo_cd) {
		this.bo_cd = bo_cd;
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
	public String getEcnt_cd() {
		return ecnt_cd;
	}
	public void setEcnt_cd(String ecnt_cd) {
		this.ecnt_cd = ecnt_cd;
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
	public String getLedt_cd() {
		return ledt_cd;
	}
	public void setLedt_cd(String ledt_cd) {
		this.ledt_cd = ledt_cd;
	}
	public String getMedi_cd() {
		return medi_cd;
	}
	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getMode_send() {
		return mode_send;
	}
	public void setMode_send(String mode_send) {
		this.mode_send = mode_send;
	}
	public String getPrt_plac_cd() {
		return prt_plac_cd;
	}
	public void setPrt_plac_cd(String prt_plac_cd) {
		this.prt_plac_cd = prt_plac_cd;
	}
	
	public String getRoute_clsf() {
		return route_clsf;
	}
	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}
	
	public String getSend_mthd() {
		return send_mthd;
	}
	public void setSend_mthd(String send_mthd) {
		this.send_mthd = send_mthd;
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
	
	public String getInwsp_send_yn() {
		return inwsp_send_yn;
	}
	public void setInwsp_send_yn(String inwsp_send_yn) {
		this.inwsp_send_yn = inwsp_send_yn;
	}
	
	public String getRoute_cd() {
		return route_cd;
	}
	public void setRoute_cd(String route_cd) {
		this.route_cd = route_cd;
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
		
	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1130_ADataSet();
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1130_A( ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1130_ADM dm = (SE_SND_1130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd			);
		cstmt.setString( 4, dm.route_clsf		);
		cstmt.setString( 5, dm.route_cd			);
		cstmt.setString( 6, dm.route_nm			);
		cstmt.setString( 7, dm.route_rank		);
		cstmt.setString( 8, dm.inwsp_send_yn	);
		cstmt.setString( 9, dm.mode				);
		cstmt.setString(10, dm.medi_cd			);
		cstmt.setString(11, dm.prt_plac_cd		);
		cstmt.setString(12, dm.ecnt_cd			);
		cstmt.setString(13, dm.ledt_cd			);
		cstmt.setString(14, dm.mode_send		);
		cstmt.setString(15, dm.bo_cd			);
		cstmt.setString(16, dm.send_plac_seq	);
		cstmt.setString(17, dm.send_rank		);
		cstmt.setString(18, dm.cnsg_seqo		);
		cstmt.setString(19, dm.send_mthd		);
		cstmt.setString(20, dm.incmg_pers_ip	);
		cstmt.setString(21, dm.incmg_pers		);
	}
	
	public void print() {
		System.out.println("cmpy_cd        	=" + getCmpy_cd      () );
		System.out.println("inwsp_send_yn  	=" + getInwsp_send_yn() );
		System.out.println("mode			=" + getMode		 () );
		System.out.println("route_clsf		=" + getRoute_clsf	 () );
		System.out.println("route_cd		=" + getRoute_cd	 () );
		System.out.println("route_nm		=" + getRoute_nm	 () );
		System.out.println("route_rank		=" + getRoute_rank	 () );
		System.out.println("medi_cd			=" + getMedi_cd		 () );
		System.out.println("prt_plac_cd	   	=" + getPrt_plac_cd	 ()	);
		System.out.println("ecnt_cd			=" + getEcnt_cd		 () );
		System.out.println("ledt_cd			=" + getLedt_cd		 () );
		System.out.println("mode_send		=" + getMode_send	 ()	);
		System.out.println("bo_cd			=" + getBo_cd		 () );
		System.out.println("send_plac_seq  	=" + getSend_plac_seq()	);
		System.out.println("send_rank		=" + getSend_rank	 ()	);
		System.out.println("cnsg_seqo		=" + getCnsg_seqo	 ()	);
		System.out.println("send_mthd		=" + getSend_mthd	 ()	);
		System.out.println("incmg_pers_ip  	=" + getIncmg_pers_ip()	);
		System.out.println("incmg_pers     	=" + getIncmg_pers   ()	);
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
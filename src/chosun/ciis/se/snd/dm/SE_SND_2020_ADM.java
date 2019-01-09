/***************************************************************************************************
* 파일명 : SE_SND_2010_LDM.java
* 기능 : 판매-발송관리-노선순위변경
* 작성일자 : 2009-02-12
* 작성자 : 김대준
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


public class SE_SND_2020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd         ;
	public String route_clsf      ;
	public String route_cd        ;
	public String prt_plac_cd     ;
	public String mode            ;
	public String route_rank      ;
	public String incmg_pers_ip   ;
	public String incmg_pers      ;

	public SE_SND_2020_ADM(){}
	public SE_SND_2020_ADM(String cmpy_cd, String route_clsf, String route_cd, String prt_plac_cd, String mode, String route_rank, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd         = cmpy_cd         ;
		this.route_clsf      = route_clsf      ;    
		this.route_cd        = route_cd        ;    
		this.prt_plac_cd     = prt_plac_cd     ;    
		this.mode            = mode            ;    
		this.route_rank      = route_rank      ;    
		this.incmg_pers_ip   = incmg_pers_ip   ;    
		this.incmg_pers   	 = incmg_pers      ;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_2020_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2020_ADM dm = (SE_SND_2020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, cmpy_cd      );
		cstmt.setString( 4, route_clsf   );
		cstmt.setString( 5, route_cd     );
		cstmt.setString( 6, prt_plac_cd  );
		cstmt.setString( 7, mode         );
		cstmt.setString( 8, route_rank   );
		cstmt.setString( 9, incmg_pers_ip);
		cstmt.setString(10, incmg_pers   );
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2020_ADataSet();
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}
	
	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}
	
	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}
	
	public void setMode(String mode){
		this.mode = mode;
	}
	
	public void setRoute_rank(String route_rank){
		this.route_rank = route_rank;
	}
	
	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}
	
	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public String getCmpy_cd(){
		return cmpy_cd;
	}
	
	public String getRoute_clsf(){
		return route_clsf;
	}
	
	public String getRoute_cd(){
		return route_cd;
	}
	
	public String getPrt_plac_cd(){
		return prt_plac_cd;
	}
	
	public String getMode(){
		return mode;
	}
	
	public String getRoute_rank(){
		return route_rank;
	}
	
	public String getIncmg_pers_ip(){
		return incmg_pers_ip;
	}
	
	public String getIncmg_pers(){
		return incmg_pers;
	}
	
    public void print(){
    	System.out.println("cmpy_cd       = " + getCmpy_cd      ());
    	System.out.println("route_clsf    = " + getRoute_clsf   ());
    	System.out.println("route_cd      = " + getRoute_cd     ());
    	System.out.println("prt_plac_cd   = " + getPrt_plac_cd  ());
    	System.out.println("mode          = " + getMode         ());
    	System.out.println("route_rank    = " + getRoute_rank   ());
    	System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
    	System.out.println("incmg_pers    = " + getIncmg_pers   ());
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
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
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
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 17:16:24 KST 2009 */
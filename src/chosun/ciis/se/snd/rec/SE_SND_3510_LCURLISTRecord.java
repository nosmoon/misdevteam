/***************************************************************************************************
* 파일명 :SE_SND_3510_LCURLIST
* 기능 : 판매 - 발송관리 - 기타매체인인쇄처관리
* 작성일자 : 2009-03-24
* 작성자 : 김진경
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_3510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String route_clsf;
	public String medi_cd;
	public String asin_prt_plac_cd;
	public String real_prt_plac_cd;
	public String remk;

	public SE_SND_3510_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setAsin_prt_plac_cd(String asin_prt_plac_cd){
		this.asin_prt_plac_cd = asin_prt_plac_cd;
	}

	public void setReal_prt_plac_cd(String real_prt_plac_cd){
		this.real_prt_plac_cd = real_prt_plac_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getAsin_prt_plac_cd(){
		return this.asin_prt_plac_cd;
	}

	public String getReal_prt_plac_cd(){
		return this.real_prt_plac_cd;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Mar 24 12:30:21 KST 2009 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-신문지원물품-조회
* 작성일자 : 2008-12-19
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *지국지원-신문지원물품-조회
 */

public class SS_U_NWSPITEMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String itemcd;
	public long qunt;
	public long uprc;
	public long divnuprc;
	public long insddivnuprc;
	public String rcpmchrgpersclsf;
	public String unit;
	public String clamchrgpersclsf;
	public String itemclsf;
	public String sendclsf;
	public String costclsf;
	public String aplcfrdt;
	public String aplctodt;
	public String aplcclostm;
	public String remk;
	public byte[] thumbnail;
	public byte[] popup;

	public SS_U_NWSPITEMDM(){}
	public SS_U_NWSPITEMDM(String incmgpers, String itemcd, long qunt, long uprc, long divnuprc, long insddivnuprc, String rcpmchrgpersclsf, String unit, String clamchrgpersclsf, String itemclsf, String sendclsf, String costclsf, String aplcfrdt, String aplctodt, String aplcclostm, String remk, byte[] thumbnail, byte[] popup){
		this.incmgpers = incmgpers;
		this.itemcd = itemcd;
		this.qunt = qunt;
		this.uprc = uprc;
		this.divnuprc = divnuprc;
		this.insddivnuprc = insddivnuprc;
		this.rcpmchrgpersclsf = rcpmchrgpersclsf;
		this.unit = unit;
		this.clamchrgpersclsf = clamchrgpersclsf;
		this.itemclsf = itemclsf;
		this.sendclsf = sendclsf;
		this.costclsf = costclsf;
		this.aplcfrdt = aplcfrdt;
		this.aplctodt = aplctodt;
		this.aplcclostm = aplcclostm;
		this.remk = remk;
		this.thumbnail = thumbnail;
		this.popup = popup;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setQunt(long qunt){
		this.qunt = qunt;
	}

	public void setUprc(long uprc){
		this.uprc = uprc;
	}

	public void setDivnuprc(long divnuprc){
		this.divnuprc = divnuprc;
	}

	public void setInsddivnuprc(long insddivnuprc){
		this.insddivnuprc = insddivnuprc;
	}

	public void setRcpmchrgpersclsf(String rcpmchrgpersclsf){
		this.rcpmchrgpersclsf = rcpmchrgpersclsf;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setClamchrgpersclsf(String clamchrgpersclsf){
		this.clamchrgpersclsf = clamchrgpersclsf;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setCostclsf(String costclsf){
		this.costclsf = costclsf;
	}

	public void setAplcfrdt(String aplcfrdt){
		this.aplcfrdt = aplcfrdt;
	}

	public void setAplctodt(String aplctodt){
		this.aplctodt = aplctodt;
	}

	public void setAplcclostm(String aplcclostm){
		this.aplcclostm = aplcclostm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setThumbnail(byte[] thumbnail){
		this.thumbnail = thumbnail;
	}

	public void setPopup(byte[] popup){
		this.popup = popup;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public long getQunt(){
		return this.qunt;
	}

	public long getUprc(){
		return this.uprc;
	}

	public long getDivnuprc(){
		return this.divnuprc;
	}

	public long getInsddivnuprc(){
		return this.insddivnuprc;
	}

	public String getRcpmchrgpersclsf(){
		return this.rcpmchrgpersclsf;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getClamchrgpersclsf(){
		return this.clamchrgpersclsf;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getCostclsf(){
		return this.costclsf;
	}

	public String getAplcfrdt(){
		return this.aplcfrdt;
	}

	public String getAplctodt(){
		return this.aplctodt;
	}

	public String getAplcclostm(){
		return this.aplcclostm;
	}

	public String getRemk(){
		return this.remk;
	}

	public byte[] getThumbnail(){
		return this.thumbnail;
	}

	public byte[] getPopup(){
		return this.popup;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_NWSPITEM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_NWSPITEMDM dm = (SS_U_NWSPITEMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.itemcd);
		cstmt.setLong(5, dm.qunt);
		cstmt.setLong(6, dm.uprc);
		cstmt.setLong(7, dm.divnuprc);
		cstmt.setLong(8, dm.insddivnuprc);
		cstmt.setString(9, dm.rcpmchrgpersclsf);
		cstmt.setString(10, dm.unit);
		cstmt.setString(11, dm.clamchrgpersclsf);
		cstmt.setString(12, dm.itemclsf);
		cstmt.setString(13, dm.sendclsf);
		cstmt.setString(14, dm.costclsf);
		cstmt.setString(15, dm.aplcfrdt);
		cstmt.setString(16, dm.aplctodt);
		cstmt.setString(17, dm.aplcclostm);
		cstmt.setString(18, dm.remk);
		cstmt.setBytes(19, dm.thumbnail);
		cstmt.setBytes(20, dm.popup);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_NWSPITEMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String divnuprc = req.getParameter("divnuprc");
if( divnuprc == null){
	System.out.println(this.toString+" : divnuprc is null" );
}else{
	System.out.println(this.toString+" : divnuprc is "+divnuprc );
}
String insddivnuprc = req.getParameter("insddivnuprc");
if( insddivnuprc == null){
	System.out.println(this.toString+" : insddivnuprc is null" );
}else{
	System.out.println(this.toString+" : insddivnuprc is "+insddivnuprc );
}
String rcpmchrgpersclsf = req.getParameter("rcpmchrgpersclsf");
if( rcpmchrgpersclsf == null){
	System.out.println(this.toString+" : rcpmchrgpersclsf is null" );
}else{
	System.out.println(this.toString+" : rcpmchrgpersclsf is "+rcpmchrgpersclsf );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String clamchrgpersclsf = req.getParameter("clamchrgpersclsf");
if( clamchrgpersclsf == null){
	System.out.println(this.toString+" : clamchrgpersclsf is null" );
}else{
	System.out.println(this.toString+" : clamchrgpersclsf is "+clamchrgpersclsf );
}
String itemclsf = req.getParameter("itemclsf");
if( itemclsf == null){
	System.out.println(this.toString+" : itemclsf is null" );
}else{
	System.out.println(this.toString+" : itemclsf is "+itemclsf );
}
String sendclsf = req.getParameter("sendclsf");
if( sendclsf == null){
	System.out.println(this.toString+" : sendclsf is null" );
}else{
	System.out.println(this.toString+" : sendclsf is "+sendclsf );
}
String costclsf = req.getParameter("costclsf");
if( costclsf == null){
	System.out.println(this.toString+" : costclsf is null" );
}else{
	System.out.println(this.toString+" : costclsf is "+costclsf );
}
String aplcfrdt = req.getParameter("aplcfrdt");
if( aplcfrdt == null){
	System.out.println(this.toString+" : aplcfrdt is null" );
}else{
	System.out.println(this.toString+" : aplcfrdt is "+aplcfrdt );
}
String aplctodt = req.getParameter("aplctodt");
if( aplctodt == null){
	System.out.println(this.toString+" : aplctodt is null" );
}else{
	System.out.println(this.toString+" : aplctodt is "+aplctodt );
}
String aplcclostm = req.getParameter("aplcclostm");
if( aplcclostm == null){
	System.out.println(this.toString+" : aplcclostm is null" );
}else{
	System.out.println(this.toString+" : aplcclostm is "+aplcclostm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String thumbnail = req.getParameter("thumbnail");
if( thumbnail == null){
	System.out.println(this.toString+" : thumbnail is null" );
}else{
	System.out.println(this.toString+" : thumbnail is "+thumbnail );
}
String popup = req.getParameter("popup");
if( popup == null){
	System.out.println(this.toString+" : popup is null" );
}else{
	System.out.println(this.toString+" : popup is "+popup );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String itemcd = Util.checkString(req.getParameter("itemcd"));
String qunt = Util.checkString(req.getParameter("qunt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String divnuprc = Util.checkString(req.getParameter("divnuprc"));
String insddivnuprc = Util.checkString(req.getParameter("insddivnuprc"));
String rcpmchrgpersclsf = Util.checkString(req.getParameter("rcpmchrgpersclsf"));
String unit = Util.checkString(req.getParameter("unit"));
String clamchrgpersclsf = Util.checkString(req.getParameter("clamchrgpersclsf"));
String itemclsf = Util.checkString(req.getParameter("itemclsf"));
String sendclsf = Util.checkString(req.getParameter("sendclsf"));
String costclsf = Util.checkString(req.getParameter("costclsf"));
String aplcfrdt = Util.checkString(req.getParameter("aplcfrdt"));
String aplctodt = Util.checkString(req.getParameter("aplctodt"));
String aplcclostm = Util.checkString(req.getParameter("aplcclostm"));
String remk = Util.checkString(req.getParameter("remk"));
String thumbnail = Util.checkString(req.getParameter("thumbnail"));
String popup = Util.checkString(req.getParameter("popup"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String divnuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("divnuprc")));
String insddivnuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("insddivnuprc")));
String rcpmchrgpersclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmchrgpersclsf")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String clamchrgpersclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clamchrgpersclsf")));
String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
String sendclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf")));
String costclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("costclsf")));
String aplcfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcfrdt")));
String aplctodt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplctodt")));
String aplcclostm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclostm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String thumbnail = Util.Uni2Ksc(Util.checkString(req.getParameter("thumbnail")));
String popup = Util.Uni2Ksc(Util.checkString(req.getParameter("popup")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setItemcd(itemcd);
dm.setQunt(qunt);
dm.setUprc(uprc);
dm.setDivnuprc(divnuprc);
dm.setInsddivnuprc(insddivnuprc);
dm.setRcpmchrgpersclsf(rcpmchrgpersclsf);
dm.setUnit(unit);
dm.setClamchrgpersclsf(clamchrgpersclsf);
dm.setItemclsf(itemclsf);
dm.setSendclsf(sendclsf);
dm.setCostclsf(costclsf);
dm.setAplcfrdt(aplcfrdt);
dm.setAplctodt(aplctodt);
dm.setAplcclostm(aplcclostm);
dm.setRemk(remk);
dm.setThumbnail(thumbnail);
dm.setPopup(popup);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 19 19:53:51 KST 2008 */
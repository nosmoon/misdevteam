/***************************************************************************************************
* 占쏙옙占싹몌옙 : 
* 占쏙옙占� : 
* 占쌜쇽옙占쏙옙占쏙옙 : 2017-01-05
* 占쌜쇽옙占쏙옙 : 占쏙옙 占쏙옙 홍
***************************************************************************************************/
/***************************************************************************************************
* 占쏙옙占쏙옙占쏙옙占쏙옙 : 
* 占쏙옙占쏙옙占쏙옙 :  
* 占쏙옙占쏙옙占쏙옙占쏙옙 : 
* 占쏙옙占� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;
/**
 * 
 */

 
public class SS_SLS_EXTN_5830_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String rdr_no;
	public String rcvr_qty;
	public String medicd;
	public String campid;
	public String rcvr_bocd;
	public String incmgpers;
	public String subscnfmstatcd;

	public SS_SLS_EXTN_5830_UDM(){}
	public SS_SLS_EXTN_5830_UDM(String rdr_extndt, String rdr_extnno, String rdr_no, String rcvr_qty, String medicd, String campid, String rcvr_bocd, String incmgpers, String subscnfmstatcd){
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.rdr_no = rdr_no;
		this.rcvr_qty = rcvr_qty;
		this.medicd = medicd;
		this.campid = campid;
		this.rcvr_bocd = rcvr_bocd;
		this.incmgpers = incmgpers;
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public String getSubscnfmstatcd() {
		return subscnfmstatcd;
	}
	public void setSubscnfmstatcd(String subscnfmstatcd) {
		this.subscnfmstatcd = subscnfmstatcd;
	}
	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRcvr_qty(String rcvr_qty){
		this.rcvr_qty = rcvr_qty;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setRcvr_bocd(String rcvr_bocd){
		this.rcvr_bocd = rcvr_bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRcvr_qty(){
		return this.rcvr_qty;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getRcvr_bocd(){
		return this.rcvr_bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_SLS_EXTN_5830_U( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5830_UDM dm = (SS_SLS_EXTN_5830_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extndt);
		cstmt.setString(4, dm.rdr_extnno);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.rcvr_qty);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.campid);
		cstmt.setString(9, dm.rcvr_bocd);
		cstmt.setString(10, dm.incmgpers);
		cstmt.setString(11, dm.subscnfmstatcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5830_UDataSet();
	}



    public void print(){
        System.out.println("rdr_extndt = " + getRdr_extndt());
        System.out.println("rdr_extnno = " + getRdr_extnno());
        System.out.println("rdr_no = " + getRdr_no());
        System.out.println("rcvr_qty = " + getRcvr_qty());
        System.out.println("medicd = " + getMedicd());
        System.out.println("campid = " + getCampid());
        System.out.println("rcvr_bocd = " + getRcvr_bocd());
        System.out.println("incmgpers = " + getIncmgpers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier�뿉�꽌 req.getParameter() 泥섎━ 諛� 寃곌낵�솗�씤 寃��궗�떆 �궗�슜�븯�떗�떆�삤.

String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String rcvr_qty = req.getParameter("rcvr_qty");
if( rcvr_qty == null){
	System.out.println(this.toString+" : rcvr_qty is null" );
}else{
	System.out.println(this.toString+" : rcvr_qty is "+rcvr_qty );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String campid = req.getParameter("campid");
if( campid == null){
	System.out.println(this.toString+" : campid is null" );
}else{
	System.out.println(this.toString+" : campid is "+campid );
}
String rcvr_bocd = req.getParameter("rcvr_bocd");
if( rcvr_bocd == null){
	System.out.println(this.toString+" : rcvr_bocd is null" );
}else{
	System.out.println(this.toString+" : rcvr_bocd is "+rcvr_bocd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier�뿉�꽌 req.getParameter() 泥섎━�떆 �궗�슜�븯�떗�떆�삤.

String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rcvr_qty = Util.checkString(req.getParameter("rcvr_qty"));
String medicd = Util.checkString(req.getParameter("medicd"));
String campid = Util.checkString(req.getParameter("campid"));
String rcvr_bocd = Util.checkString(req.getParameter("rcvr_bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier�뿉�꽌 �븳湲�泥섎━�� �룞�떆�뿉 req.getParameter() 泥섎━�떆 �궗�슜�븯�떗�떆�삤.

String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rcvr_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_qty")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
String rcvr_bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier�뿉�꽌 DM �뙆�씪�쓽 蹂��닔瑜� �꽕�젙�떆 �궗�슜�븯�떗�떆�삤.

dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setRdr_no(rdr_no);
dm.setRcvr_qty(rcvr_qty);
dm.setMedicd(medicd);
dm.setCampid(campid);
dm.setRcvr_bocd(rcvr_bocd);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* �옉�꽦�떆媛� : Mon Feb 19 16:55:38 KST 2018 */
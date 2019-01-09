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
 

public class SS_SLS_EXTN_5840_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String medicd;
	public String campid;
	public String subscnfmstatcd;
	public String incmgpers;

	public SS_SLS_EXTN_5840_UDM(){}
	public SS_SLS_EXTN_5840_UDM(String rdr_extndt, String rdr_extnno, String medicd, String campid, String subscnfmstatcd, String incmgpers){
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.medicd = medicd;
		this.campid = campid;
		this.subscnfmstatcd = subscnfmstatcd;
		this.incmgpers = incmgpers;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
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

	public String getMedicd(){
		return this.medicd;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_SLS_EXTN_5840_U( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5840_UDM dm = (SS_SLS_EXTN_5840_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extndt);
		cstmt.setString(4, dm.rdr_extnno);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.campid);
		cstmt.setString(7, dm.subscnfmstatcd);
		cstmt.setString(8, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5840_UDataSet();
	}



    public void print(){
        System.out.println("rdr_extndt = " + getRdr_extndt());
        System.out.println("rdr_extnno = " + getRdr_extnno());
        System.out.println("medicd = " + getMedicd());
        System.out.println("campid = " + getCampid());
        System.out.println("subscnfmstatcd = " + getSubscnfmstatcd());
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
String subscnfmstatcd = req.getParameter("subscnfmstatcd");
if( subscnfmstatcd == null){
	System.out.println(this.toString+" : subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : subscnfmstatcd is "+subscnfmstatcd );
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
String medicd = Util.checkString(req.getParameter("medicd"));
String campid = Util.checkString(req.getParameter("campid"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier�뿉�꽌 �븳湲�泥섎━�� �룞�떆�뿉 req.getParameter() 泥섎━�떆 �궗�슜�븯�떗�떆�삤.

String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier�뿉�꽌 DM �뙆�씪�쓽 蹂��닔瑜� �꽕�젙�떆 �궗�슜�븯�떗�떆�삤.

dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setMedicd(medicd);
dm.setCampid(campid);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* �옉�꽦�떆媛� : Fri Mar 02 10:25:06 KST 2018 */
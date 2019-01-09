/***************************************************************************************************
* ���ϸ� : SS_U_JOBRECDM.java
* ��� : �������� ���Ͼ������� ����
* �ۼ����� : 2003-12-23
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * class definition
 *
 */


public class SS_U_JOBRECDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String makedt;
	public String makepersid;
	public String curddplan;
	public String prvddproc;
	public String etc;
	public String filenm;
	public String filesize;
	public byte[] filecont;
	public String chgpers;
	public Timestamp chgdt;

	public SS_U_JOBRECDM(){}
	public SS_U_JOBRECDM(String makedt, String makepersid, String curddplan, String prvddproc, String etc, String filenm, String filesize, byte[] filecont, String chgpers, Timestamp chgdt){
		this.makedt = makedt;
		this.makepersid = makepersid;
		this.curddplan = curddplan;
		this.prvddproc = prvddproc;
		this.etc = etc;
		this.filenm = filenm;
		this.filesize = filesize;
		this.filecont = filecont;
		this.chgpers = chgpers;
		this.chgdt = chgdt;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setCurddplan(String curddplan){
		this.curddplan = curddplan;
	}

	public void setPrvddproc(String prvddproc){
		this.prvddproc = prvddproc;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setFilesize(String filesize){
		this.filesize = filesize;
	}

	public void setFilecont(byte[] filecont){
		this.filecont = filecont;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgdt(Timestamp chgdt){
		this.chgdt = chgdt;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getCurddplan(){
		return this.curddplan;
	}

	public String getPrvddproc(){
		return this.prvddproc;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getFilesize(){
		return this.filesize;
	}

	public byte[] getFilecont(){
		return this.filecont;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public Timestamp getChgdt(){
		return this.chgdt;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_JOBREC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_JOBRECDM dm = (SS_U_JOBRECDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.makedt);
		cstmt.setString(4, dm.makepersid);
		cstmt.setString(5, dm.curddplan);
		cstmt.setString(6, dm.prvddproc);
		cstmt.setString(7, dm.etc);
		cstmt.setString(8, dm.filenm);
		cstmt.setString(9, dm.filesize);
        cstmt.setBytes(10, dm.filecont);
		cstmt.setString(11, dm.chgpers);
		cstmt.setTimestamp(12, dm.chgdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_U_JOBRECDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String makedt = req.getParameter("makedt");
if( makedt == null){
	System.out.println(this.toString+" : makedt is null" );
}else{
	System.out.println(this.toString+" : makedt is "+makedt );
}
String makepersid = req.getParameter("makepersid");
if( makepersid == null){
	System.out.println(this.toString+" : makepersid is null" );
}else{
	System.out.println(this.toString+" : makepersid is "+makepersid );
}
String curddplan = req.getParameter("curddplan");
if( curddplan == null){
	System.out.println(this.toString+" : curddplan is null" );
}else{
	System.out.println(this.toString+" : curddplan is "+curddplan );
}
String prvddproc = req.getParameter("prvddproc");
if( prvddproc == null){
	System.out.println(this.toString+" : prvddproc is null" );
}else{
	System.out.println(this.toString+" : prvddproc is "+prvddproc );
}
String etc = req.getParameter("etc");
if( etc == null){
	System.out.println(this.toString+" : etc is null" );
}else{
	System.out.println(this.toString+" : etc is "+etc );
}
String filenm = req.getParameter("filenm");
if( filenm == null){
	System.out.println(this.toString+" : filenm is null" );
}else{
	System.out.println(this.toString+" : filenm is "+filenm );
}
String filesize = req.getParameter("filesize");
if( filesize == null){
	System.out.println(this.toString+" : filesize is null" );
}else{
	System.out.println(this.toString+" : filesize is "+filesize );
}
String filecont = req.getParameter("filecont");
if( filecont == null){
	System.out.println(this.toString+" : filecont is null" );
}else{
	System.out.println(this.toString+" : filecont is "+filecont );
}
String chgpers = req.getParameter("chgpers");
if( chgpers == null){
	System.out.println(this.toString+" : chgpers is null" );
}else{
	System.out.println(this.toString+" : chgpers is "+chgpers );
}
String chgdt = req.getParameter("chgdt");
if( chgdt == null){
	System.out.println(this.toString+" : chgdt is null" );
}else{
	System.out.println(this.toString+" : chgdt is "+chgdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String makedt = Util.checkString(req.getParameter("makedt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
String curddplan = Util.checkString(req.getParameter("curddplan"));
String prvddproc = Util.checkString(req.getParameter("prvddproc"));
String etc = Util.checkString(req.getParameter("etc"));
String filenm = Util.checkString(req.getParameter("filenm"));
String filesize = Util.checkString(req.getParameter("filesize"));
String filecont = Util.checkString(req.getParameter("filecont"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
String chgdt = Util.checkString(req.getParameter("chgdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
String curddplan = Util.Uni2Ksc(Util.checkString(req.getParameter("curddplan")));
String prvddproc = Util.Uni2Ksc(Util.checkString(req.getParameter("prvddproc")));
String etc = Util.Uni2Ksc(Util.checkString(req.getParameter("etc")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String filesize = Util.Uni2Ksc(Util.checkString(req.getParameter("filesize")));
String filecont = Util.Uni2Ksc(Util.checkString(req.getParameter("filecont")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
String chgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("chgdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMakedt(makedt);
dm.setMakepersid(makepersid);
dm.setCurddplan(curddplan);
dm.setPrvddproc(prvddproc);
dm.setEtc(etc);
dm.setFilenm(filenm);
dm.setFilesize(filesize);
dm.setFilecont(filecont);
dm.setChgpers(chgpers);
dm.setChgdt(chgdt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 23 16:02:55 KST 2003 */
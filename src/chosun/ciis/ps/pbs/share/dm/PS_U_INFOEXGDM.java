/***************************************************************************************************
* ���ϸ� : PS_U_INFOEXGDM.java
* ��� : ���Ǳ� �Խ��� ����
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * ���Ǳ� ���� ����
 *
 */


public class PS_U_INFOEXGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public long seq;
	public String notifrdt;
	public String notitodt;
	public String email;
	public String hmpg;
	public String titl;
	public String cont1;
	public String cont2;
	public String cont3;
	public String cont4;
	public String cont5;
	public String filenm;
	public String filesize;
	public byte[] filecont;
	public String incmgpers;
	public String cmpycd;
	public String rmsgexttcd;
	public String jobcd;

    public String filepath;

	public PS_U_INFOEXGDM(){}
	public PS_U_INFOEXGDM(String clsf, long seq, String notifrdt, String notitodt, String email, String hmpg, String titl, String cont1, String cont2, String cont3, String cont4, String cont5, String filenm, String filesize, byte[] filecont, String incmgpers, String cmpycd, String rmsgexttcd, String jobcd){
		this.clsf = clsf;
		this.seq = seq;
		this.notifrdt = notifrdt;
		this.notitodt = notitodt;
		this.email = email;
		this.hmpg = hmpg;
		this.titl = titl;
		this.cont1 = cont1;
		this.cont2 = cont2;
		this.cont3 = cont3;
		this.cont4 = cont4;
		this.cont5 = cont5;
		this.filenm = filenm;
		this.filesize = filesize;
		this.filecont = filecont;
		this.incmgpers = incmgpers;
		this.cmpycd = cmpycd;
		this.rmsgexttcd = rmsgexttcd;
		this.jobcd = jobcd;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setNotifrdt(String notifrdt){
		this.notifrdt = notifrdt;
	}

	public void setNotitodt(String notitodt){
		this.notitodt = notitodt;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setHmpg(String hmpg){
		this.hmpg = hmpg;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont1(String cont1){
		this.cont1 = cont1;
	}

	public void setCont2(String cont2){
		this.cont2 = cont2;
	}

	public void setCont3(String cont3){
		this.cont3 = cont3;
	}

	public void setCont4(String cont4){
		this.cont4 = cont4;
	}

	public void setCont5(String cont5){
		this.cont5 = cont5;
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

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setRmsgexttcd(String rmsgexttcd){
		this.rmsgexttcd = rmsgexttcd;
	}

	public void setJobcd(String jobcd){
		this.jobcd = jobcd;
	}

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

	public String getClsf(){
		return this.clsf;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getNotifrdt(){
		return this.notifrdt;
	}

	public String getNotitodt(){
		return this.notitodt;
	}

	public String getEmail(){
		return this.email;
	}

	public String getHmpg(){
		return this.hmpg;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont1(){
		return this.cont1;
	}

	public String getCont2(){
		return this.cont2;
	}

	public String getCont3(){
		return this.cont3;
	}

	public String getCont4(){
		return this.cont4;
	}

	public String getCont5(){
		return this.cont5;
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

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getRmsgexttcd(){
		return this.rmsgexttcd;
	}

	public String getJobcd(){
		return this.jobcd;
	}

    public String getFilepath() {
        return this.filepath;
    }

	public String getSQL(){
		 return "{ call SP_PS_U_INFOEXG( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_INFOEXGDM dm = (PS_U_INFOEXGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setLong(4, dm.seq);
		cstmt.setString(5, dm.notifrdt);
		cstmt.setString(6, dm.notitodt);
		cstmt.setString(7, dm.email);
		cstmt.setString(8, dm.hmpg);
		cstmt.setString(9, dm.titl);
		cstmt.setString(10, dm.cont1);
		cstmt.setString(11, dm.cont2);
		cstmt.setString(12, dm.cont3);
		cstmt.setString(13, dm.cont4);
		cstmt.setString(14, dm.cont5);
		cstmt.setString(15, dm.filenm);
		cstmt.setString(16, dm.filesize);
		cstmt.setBytes(17, "1010".getBytes());
		cstmt.setString(18, dm.incmgpers);
		cstmt.setString(19, dm.cmpycd);
		cstmt.setString(20, dm.rmsgexttcd);
		cstmt.setString(21, dm.jobcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_U_INFOEXGDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String notifrdt = req.getParameter("notifrdt");
if( notifrdt == null){
	System.out.println(this.toString+" : notifrdt is null" );
}else{
	System.out.println(this.toString+" : notifrdt is "+notifrdt );
}
String notitodt = req.getParameter("notitodt");
if( notitodt == null){
	System.out.println(this.toString+" : notitodt is null" );
}else{
	System.out.println(this.toString+" : notitodt is "+notitodt );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String hmpg = req.getParameter("hmpg");
if( hmpg == null){
	System.out.println(this.toString+" : hmpg is null" );
}else{
	System.out.println(this.toString+" : hmpg is "+hmpg );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont1 = req.getParameter("cont1");
if( cont1 == null){
	System.out.println(this.toString+" : cont1 is null" );
}else{
	System.out.println(this.toString+" : cont1 is "+cont1 );
}
String cont2 = req.getParameter("cont2");
if( cont2 == null){
	System.out.println(this.toString+" : cont2 is null" );
}else{
	System.out.println(this.toString+" : cont2 is "+cont2 );
}
String cont3 = req.getParameter("cont3");
if( cont3 == null){
	System.out.println(this.toString+" : cont3 is null" );
}else{
	System.out.println(this.toString+" : cont3 is "+cont3 );
}
String cont4 = req.getParameter("cont4");
if( cont4 == null){
	System.out.println(this.toString+" : cont4 is null" );
}else{
	System.out.println(this.toString+" : cont4 is "+cont4 );
}
String cont5 = req.getParameter("cont5");
if( cont5 == null){
	System.out.println(this.toString+" : cont5 is null" );
}else{
	System.out.println(this.toString+" : cont5 is "+cont5 );
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String rmsgexttcd = req.getParameter("rmsgexttcd");
if( rmsgexttcd == null){
	System.out.println(this.toString+" : rmsgexttcd is null" );
}else{
	System.out.println(this.toString+" : rmsgexttcd is "+rmsgexttcd );
}
String jobcd = req.getParameter("jobcd");
if( jobcd == null){
	System.out.println(this.toString+" : jobcd is null" );
}else{
	System.out.println(this.toString+" : jobcd is "+jobcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String clsf = Util.checkString(req.getParameter("clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String notifrdt = Util.checkString(req.getParameter("notifrdt"));
String notitodt = Util.checkString(req.getParameter("notitodt"));
String email = Util.checkString(req.getParameter("email"));
String hmpg = Util.checkString(req.getParameter("hmpg"));
String titl = Util.checkString(req.getParameter("titl"));
String cont1 = Util.checkString(req.getParameter("cont1"));
String cont2 = Util.checkString(req.getParameter("cont2"));
String cont3 = Util.checkString(req.getParameter("cont3"));
String cont4 = Util.checkString(req.getParameter("cont4"));
String cont5 = Util.checkString(req.getParameter("cont5"));
String filenm = Util.checkString(req.getParameter("filenm"));
String filesize = Util.checkString(req.getParameter("filesize"));
String filecont = Util.checkString(req.getParameter("filecont"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));
String jobcd = Util.checkString(req.getParameter("jobcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String notifrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("notifrdt")));
String notitodt = Util.Uni2Ksc(Util.checkString(req.getParameter("notitodt")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String hmpg = Util.Uni2Ksc(Util.checkString(req.getParameter("hmpg")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont1")));
String cont2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont2")));
String cont3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont3")));
String cont4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont4")));
String cont5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont5")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String filesize = Util.Uni2Ksc(Util.checkString(req.getParameter("filesize")));
String filecont = Util.Uni2Ksc(Util.checkString(req.getParameter("filecont")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String rmsgexttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgexttcd")));
String jobcd = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setClsf(clsf);
dm.setSeq(seq);
dm.setNotifrdt(notifrdt);
dm.setNotitodt(notitodt);
dm.setEmail(email);
dm.setHmpg(hmpg);
dm.setTitl(titl);
dm.setCont1(cont1);
dm.setCont2(cont2);
dm.setCont3(cont3);
dm.setCont4(cont4);
dm.setCont5(cont5);
dm.setFilenm(filenm);
dm.setFilesize(filesize);
dm.setFilecont(filecont);
dm.setIncmgpers(incmgpers);
dm.setCmpycd(cmpycd);
dm.setRmsgexttcd(rmsgexttcd);
dm.setJobcd(jobcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 26 14:47:45 KST 2004 */
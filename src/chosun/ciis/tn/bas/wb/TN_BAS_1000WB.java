package chosun.ciis.tn.bas.wb;

import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.tn.bas.dm.TN_BAS_1000_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_1001_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_1002_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_1003_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_1004_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_1100_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_1101_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_1102_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_1103_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_2000_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_2001_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_2002_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_2003_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_2100_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_2101_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_2102_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_2103_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3000_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3001_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3002_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3003_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3100_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3101_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3102_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3103_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3200_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3201_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3202_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3203_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3300_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3301_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3302_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3303_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_3400_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3401_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_3402_ADM;
import chosun.ciis.tn.bas.dm.TN_BAS_4000_MDM;
import chosun.ciis.tn.bas.dm.TN_BAS_4001_LDM;
import chosun.ciis.tn.bas.dm.TN_BAS_4002_ADM;
import chosun.ciis.tn.bas.ds.TN_BAS_1000_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_1001_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_1002_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_1003_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_1004_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_1100_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_1101_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_1102_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_1103_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_2000_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_2001_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_2002_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_2003_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_2100_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_2101_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_2102_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_2103_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3000_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3001_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3002_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3003_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3100_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3101_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3102_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3103_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3200_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3201_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3202_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3203_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3300_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3301_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3302_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3303_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3400_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3401_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_3402_ADataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_4000_MDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_4001_LDataSet;
import chosun.ciis.tn.bas.ds.TN_BAS_4002_ADataSet;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;

public class TN_BAS_1000WB extends BaseWB
{
  public void tn_bas_1000(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_1000_LDataSet ds = null;
    TN_BAS_1000_LDM dm = new TN_BAS_1000_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_1000_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_1001(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_1001_LDataSet ds = null;
    TN_BAS_1001_LDM dm = new TN_BAS_1001_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.organidx = Util.checkString(req.getParameter("organidx"));

    dm.print();

    ds = (TN_BAS_1001_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("error");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_1002(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_1002_ADataSet ds = null;
    TN_BAS_1002_ADM dm = new TN_BAS_1002_ADM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.organidx = Util.checkString(req.getParameter("organidx"));
    dm.organname = Util.checkString(req.getParameter("organname"));
    dm.businessno = Util.checkString(req.getParameter("businessno"));
    dm.address = Util.checkString(req.getParameter("address"));
    dm.law = Util.checkString(req.getParameter("law"));
    dm.recipientname = Util.checkString(req.getParameter("recipientname"));
    dm.stampimagepath = Util.checkString(req.getParameter("stampimagepath"));

    dm.print();

    ds = (TN_BAS_1002_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_1003(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_1003_ADataSet ds = null;
    TN_BAS_1003_ADM dm = new TN_BAS_1003_ADM();

    String multiUpData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.organidx = ((String)hash1.get("organidx"));

    dm.print();

    ds = (TN_BAS_1003_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_1004(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException
  {
    DBManager manager = new DBManager("MISTNN");

    Hashtable ht = new Hashtable();
    byte[] phot = new byte[10485760];
    String file_name = "";
    String file_size = "";
    int sizeLimit = 10485760;

    MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR");

    TN_BAS_1004_ADataSet ds = null;
    TN_BAS_1004_ADM dm = new TN_BAS_1004_ADM();
    Part part;
    while ((part = mp.readNextPart()) != null)
    {
    //  Part part;
      String name = part.getName();

      if (part.isParam()) {
        ht.put(part.getName(), ((ParamPart)part).getStringValue());
      } else if (part.isFile()) {
        FilePart filePart = (FilePart)part;
        file_name = filePart.getFileName();
        if (file_name != null) {
          ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
          ((FilePart)part).writeTo(byteArrayOutputStream);

          phot = byteArrayOutputStream.toByteArray();

          file_size = String.valueOf(phot.length);
        }

      }

    }

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.organidx = Util.checkString((String)ht.get("organidx"));
    dm.stampimagepath = Util.checkString((String)ht.get("file_upload"));
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.phot = "1010".getBytes();

    dm.print();

    ds = (TN_BAS_1004_ADataSet)manager.executeCall(dm);
    if (!ds.getErrcode().equals("")) {
      throw new AppException(ds.getErrcode(), ds.getErrmsg());
    }

    if (file_name != "") {
      try
      {
        manager.getConnection();
        manager.m_conn.setAutoCommit(false);

        Statement stmt = manager.m_conn.createStatement();

        String blobQuery = "SELECT PHOT FROM MASTER_ORGAN WHERE ORGANIDX = '" + dm.organidx + "' FOR UPDATE";

        OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

        if (rset.next())
        {
          BLOB oracle_blob = (BLOB)rset.getBlob(1);
          OutputStream os = oracle_blob.getBinaryOutputStream();

          for (int i = 0; i < phot.length; i++) {
            os.write(phot[i]);
          }

          os.close();
        }
        stmt.close();
        manager.m_conn.commit();
        manager.disConnection();
      }
      catch (SQLException e) {
        try {
          manager.m_conn.rollback();
          manager.disConnection();
        } catch (SQLException se) {
          manager.disConnection();
          throw new SysException(se);
        }
        manager.disConnection();
        throw new SysException(e);
      }
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_1100(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_1100_MDataSet ds = null;
    TN_BAS_1100_MDM dm = new TN_BAS_1100_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.organidx = Util.checkString(req.getParameter("organidx"));

    dm.print();

    ds = (TN_BAS_1100_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_1101(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_1101_LDataSet ds = null;
    TN_BAS_1101_LDM dm = new TN_BAS_1101_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.organidx = Util.checkString(req.getParameter("organidx"));

    dm.print();

    ds = (TN_BAS_1101_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_1102(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISTNN");
    TN_BAS_1102_ADataSet ds = null;
    TN_BAS_1102_ADM dm = new TN_BAS_1102_ADM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.organidx = Util.checkString(req.getParameter("organidx"));
    dm.deptidx = Util.checkString(req.getParameter("deptidx"));
    dm.deptname = Util.checkString(req.getParameter("deptname"));
    dm.deptcategory = Util.checkString(req.getParameter("deptcategory"));
    dm.description = Util.checkString(req.getParameter("description"));

    dm.print();

    ds = (TN_BAS_1102_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_1103(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_1103_ADataSet ds = null;
    TN_BAS_1103_ADM dm = new TN_BAS_1103_ADM();

    String multiUpData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.deptidx = ((String)hash1.get("deptidx"));
    dm.organidx = ((String)hash1.get("organidx"));

    dm.print();

    ds = (TN_BAS_1103_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_2000(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_2000_MDataSet ds = null;
    TN_BAS_2000_MDM dm = new TN_BAS_2000_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_2000_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_2001(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_2001_LDataSet ds = null;
    TN_BAS_2001_LDM dm = new TN_BAS_2001_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.membertype = Util.checkString(req.getParameter("membertype"));

    dm.print();

    ds = (TN_BAS_2001_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_2100(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_2100_MDataSet ds = null;
    TN_BAS_2100_MDM dm = new TN_BAS_2100_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_2100_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_2101(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_2101_LDataSet ds = null;
    TN_BAS_2101_LDM dm = new TN_BAS_2101_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_2101_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_2102(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_2102_ADataSet ds = null;
    TN_BAS_2102_ADM dm = new TN_BAS_2102_ADM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.relationidx = Util.checkString(req.getParameter("relationidx"));
    dm.relationtype = Util.checkString(req.getParameter("relationtype"));
    dm.relation1 = Util.checkString(req.getParameter("relation1"));
    dm.relation2 = Util.checkString(req.getParameter("relation2"));
    dm.displayorder = Util.checkString(req.getParameter("displayorder"));

    dm.print();

    ds = (TN_BAS_2102_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_2103(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_2103_ADataSet ds = null;
    TN_BAS_2103_ADM dm = new TN_BAS_2103_ADM();
    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    String multiUpDate = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpDate);
    System.out.print(hash1);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.relationidx = ((String)hash1.get("relationidx"));

    String multiUpDate2 = Util.checkString(req.getParameter("multiUpData2"));
    Hashtable hash2 = getHashMultiUpdateData(multiUpDate2);
    dm.mode_2 = ((String)hash2.get("m")).toUpperCase();
    dm.relationidx_2 = ((String)hash2.get("relationidx"));

    String multiUpDate3 = Util.checkString(req.getParameter("multiUpData3"));
    Hashtable hash3 = getHashMultiUpdateData(multiUpDate3);
    dm.mode_3 = ((String)hash3.get("m")).toUpperCase();
    dm.relationidx_3 = ((String)hash3.get("relationidx"));
    dm.print();

    ds = (TN_BAS_2103_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }
  public void tn_bas_2002(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_2002_ADataSet ds = null;
    TN_BAS_2002_ADM dm = new TN_BAS_2002_ADM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.membercategorycode = Util.checkString(req.getParameter("membercategorycode"));
    dm.parentmembercategorycode = Util.checkString(req.getParameter("parentmembercategorycode"));
    dm.membertype = Util.checkString(req.getParameter("membertype"));
    dm.depth = Util.checkString(req.getParameter("depth"));
    dm.membercategory = Util.checkString(req.getParameter("membercategory"));
    dm.displayorder = Util.checkString(req.getParameter("displayorder"));
    dm.description = Util.checkString(req.getParameter("description"));

    dm.print();

    ds = (TN_BAS_2002_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_2003(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_2003_ADataSet ds = null;
    TN_BAS_2003_ADM dm = new TN_BAS_2003_ADM();
    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    String multiUpDate = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpDate);

    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.membercategorycode = ((String)hash1.get("membercategorycode"));
    dm.parentmembercategorycode = ((String)hash1.get("parentmembercategorycode"));
    dm.depth = ((String)hash1.get("depth"));
    dm.print();

    dm.print();

    ds = (TN_BAS_2003_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3000(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3000_MDataSet ds = null;
    TN_BAS_3000_MDM dm = new TN_BAS_3000_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3000_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3001(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3001_LDataSet ds = null;
    TN_BAS_3001_LDM dm = new TN_BAS_3001_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3001_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3002(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3002_ADataSet ds = null;
    TN_BAS_3002_ADM dm = new TN_BAS_3002_ADM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.fundidx = Util.checkString(req.getParameter("fundidx"));
    dm.parent_fundcode = Util.checkString(req.getParameter("parentfundcode"));
    dm.depth = Util.checkString(req.getParameter("depth"));
    dm.fund = Util.checkString(req.getParameter("fund"));
    dm.fundcode = Util.checkString(req.getParameter("fundcode"));
    dm.memo = Util.checkString(req.getParameter("memo"));
    dm.supportidx = Util.checkString(req.getParameter("supportidx"));
    dm.personreceiptcode = Util.checkString(req.getParameter("personreceiptcode"));
    dm.companyreceiptcode = Util.checkString(req.getParameter("companyreceiptcode"));
    dm.displayorder = Util.checkString(req.getParameter("displayorder"));
    dm.useinsert = Util.checkString(req.getParameter("useinsert"));

    dm.print();

    ds = (TN_BAS_3002_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3003(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3003_ADataSet ds = null;
    TN_BAS_3003_ADM dm = new TN_BAS_3003_ADM();

    String multiUpData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.fundidx = ((String)hash1.get("fundidx"));
    dm.fundcode = ((String)hash1.get("fundcode"));

    dm.print();

    ds = (TN_BAS_3003_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3100(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3100_MDataSet ds = null;
    TN_BAS_3100_MDM dm = new TN_BAS_3100_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3100_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3101(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3101_LDataSet ds = null;
    TN_BAS_3101_LDM dm = new TN_BAS_3101_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3101_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3102(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3102_ADataSet ds = null;
    TN_BAS_3102_ADM dm = new TN_BAS_3102_ADM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.supportidx = Util.checkString(req.getParameter("supportidx"));
    dm.parent_supportcode = Util.checkString(req.getParameter("parentsupportcode"));
    dm.depth = Util.checkString(req.getParameter("depth"));
    dm.support = Util.checkString(req.getParameter("support"));
    dm.supportcode = Util.checkString(req.getParameter("supportcode"));
    dm.memo = Util.checkString(req.getParameter("memo"));
    dm.displayorder = Util.checkString(req.getParameter("displayorder"));
    dm.useinsert = Util.checkString(req.getParameter("useinsert"));

    dm.print();

    ds = (TN_BAS_3102_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3103(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3103_ADataSet ds = null;
    TN_BAS_3103_ADM dm = new TN_BAS_3103_ADM();

    String multiUpData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.supportidx = ((String)hash1.get("supportidx"));
    dm.supportcode = ((String)hash1.get("supportcode"));

    dm.print();

    ds = (TN_BAS_3103_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3200(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3200_MDataSet ds = null;
    TN_BAS_3200_MDM dm = new TN_BAS_3200_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3200_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3201(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3201_LDataSet ds = null;
    TN_BAS_3201_LDM dm = new TN_BAS_3201_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3201_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3202(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3202_ADataSet ds = null;
    TN_BAS_3202_ADM dm = new TN_BAS_3202_ADM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
    dm.parentpaymethodcode = Util.checkString(req.getParameter("parentpaymethodcode"));
    dm.paymethodtype = Util.checkString(req.getParameter("paymethodtype"));
    dm.depth = Util.checkString(req.getParameter("depth"));
    dm.paymethod = Util.checkString(req.getParameter("paymethod"));
    dm.displayorder = Util.checkString(req.getParameter("displayorder"));
    dm.description = Util.checkString(req.getParameter("description"));

    dm.print();

    ds = (TN_BAS_3202_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3203(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3203_ADataSet ds = null;
    TN_BAS_3203_ADM dm = new TN_BAS_3203_ADM();

    String multiUpData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.depth = ((String)hash1.get("depth"));
    dm.paymethodcode = ((String)hash1.get("paymethodcode"));
    dm.parentpaymethodcode = ((String)hash1.get("parentpaymethodcode"));

    dm.print();

    ds = (TN_BAS_3203_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3300(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3300_MDataSet ds = null;
    TN_BAS_3300_MDM dm = new TN_BAS_3300_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3300_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3301(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3301_LDataSet ds = null;
    TN_BAS_3301_LDM dm = new TN_BAS_3301_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3301_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }
  public void tn_bas_3302(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3302_ADataSet ds = null;
    TN_BAS_3302_ADM dm = new TN_BAS_3302_ADM();

    String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpDate);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.bankaccountcode = ((String)hash1.get("bankaccountcode"));
    dm.bankcode = ((String)hash1.get("bankcode"));
    dm.bank = ((String)hash1.get("bank"));
    dm.branch = ((String)hash1.get("branch"));
    dm.bankaccount = ((String)hash1.get("bankaccount"));
    dm.bankaccountowner = ((String)hash1.get("bankaccountowner"));
    dm.memo = ((String)hash1.get("memo"));
    dm.useinsert = ((String)hash1.get("useinsert"));

    dm.print();

    ds = (TN_BAS_3302_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3303(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3303_ADataSet ds = null;
    TN_BAS_3303_ADM dm = new TN_BAS_3303_ADM();

    String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpDate);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.bankaccountcode = ((String)hash1.get("bankaccountcode"));

    dm.print();

    ds = (TN_BAS_3303_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3400(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3400_MDataSet ds = null;
    TN_BAS_3400_MDM dm = new TN_BAS_3400_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3400_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3401(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3401_LDataSet ds = null;
    TN_BAS_3401_LDM dm = new TN_BAS_3401_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_3401_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_3402(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_3402_ADataSet ds = null;
    TN_BAS_3402_ADM dm = new TN_BAS_3402_ADM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.fundidx = Util.checkString(req.getParameter("fundidx"));
    dm.supportidx = Util.checkString(req.getParameter("supportidx"));

    dm.print();

    ds = (TN_BAS_3402_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_4000(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_4000_MDataSet ds = null;
    TN_BAS_4000_MDM dm = new TN_BAS_4000_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_4000_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_4001(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_4001_LDataSet ds = null;
    TN_BAS_4001_LDM dm = new TN_BAS_4001_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.print();

    ds = (TN_BAS_4001_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void tn_bas_4002(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISTNN");

    TN_BAS_4002_ADataSet ds = null;
    TN_BAS_4002_ADM dm = new TN_BAS_4002_ADM();
    System.out.print("TN_BAS_4002_ADM11");
    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    System.out.print("TN_BAS_4002_ADM22");

    String multiUpDate = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpDate);
    System.out.print(hash1);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.receiptcodeidx = ((String)hash1.get("receiptcodeidx"));
    dm.category = ((String)hash1.get("category"));
    dm.receiptcode = ((String)hash1.get("receiptcode"));
    dm.receiptcodetype = ((String)hash1.get("receiptcodetype"));
    dm.description = ((String)hash1.get("description"));
    dm.useinsert = ((String)hash1.get("useinsert"));
    dm.print();

    String multiUpDate2 = Util.checkString(req.getParameter("multiUpData2"));
    Hashtable hash2 = getHashMultiUpdateData(multiUpDate2);

    dm.mode_2 = ((String)hash2.get("m")).toUpperCase();
    dm.receiptcodeidx_2 = ((String)hash2.get("receiptcodeidx"));
    dm.category_2 = ((String)hash2.get("category"));
    dm.receiptcode_2 = ((String)hash2.get("receiptcode"));
    dm.receiptcodetype_2 = ((String)hash2.get("receiptcodetype"));
    dm.description_2 = ((String)hash2.get("description"));
    dm.useinsert_2 = ((String)hash2.get("useinsert"));

    dm.print();

    ds = (TN_BAS_4002_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }
}
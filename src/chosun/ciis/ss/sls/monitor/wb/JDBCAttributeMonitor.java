package chosun.ciis.ss.sls.monitor.wb;

import weblogic.jndi.*;
import weblogic.management.Admin;
import weblogic.management.MBeanHome;
import weblogic.management.RemoteMBeanServer;
import weblogic.management.RemoteNotificationListener;
import weblogic.management.WebLogicMBean;
import weblogic.management.WebLogicObjectName;
import weblogic.management.runtime.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;

import chosun.ciis.ss.sls.monitor.rec.*;

public class JDBCAttributeMonitor {
    //public ArrayList monitorlist;

    public ArrayList monitor(String urlclsf,String disclsf) {
        ArrayList monitorlist = new ArrayList();
        try {
            Hashtable env = new Hashtable();

            //URL 변수
            String  strUrl  =  "";
            String  strId   =  "";
            String  strPass =  "";
            
            //URL 구분에 따라 URL SET
            if(urlclsf.equals("SAL")) {
                //판매지국
                strUrl  =  "t3://220.73.135.81:5010";
                strId   =  "system";
                strPass =  "gosemvhs";
            } else if (urlclsf.equals("SSL")) {
                //판매국
                strUrl  =  "t3://220.73.135.81:5020";
                strId   =  "system";
                strPass =  "gosemvhs";
            } else if (urlclsf.equals("PUB")) {
                //출판지사
                strUrl  =  "t3://220.73.135.82:5030";
                strId   =  "system";
                strPass =  "gosemvhs";
            } else if (urlclsf.equals("PBL")) {
                //출판국
                strUrl  =  "t3://220.73.135.82:5040";
                strId   =  "system";
                strPass =  "gosemvhs";
            } else if (urlclsf.equals("BIG")) {
                //통합빌링(일반)
                strUrl  =  "t3://220.73.135.71:8010";
                strId   =  "system";
                strPass =  "gosemvhs";
            } else if (urlclsf.equals("BIM")) {
                //통합빌링(관리자)
                strUrl  =  "t3://220.73.135.71:8050";
                strId   =  "system";
                strPass =  "gosemvhs";
            } else if (urlclsf.equals("PRI")) {
                //회원통합
                strUrl  =  "t3://220.73.135.73:8030";
                strId   =  "system";
                strPass =  "gosemvhs";
            } else if (urlclsf.equals("COL")) {
                //콜센터
                strUrl  =  "t3://220.73.135.55:7010";
                strId   =  "system";
                strPass =  "gosemvhs";
            }

            //env.put(Context.PROVIDER_URL, "t3://220.73.135.81:5010");       //판매지국 서버 URL
            //env.put(Context.PROVIDER_URL, "t3://220.73.135.81:5020");       //판매국 서버 URL
            //env.put(Context.PROVIDER_URL, "t3://220.73.135.82:5030");       //출판지사 서버 URL
            //env.put(Context.PROVIDER_URL, "t3://220.73.135.82:5040");       //출판국 서버 URL
            //env.put(Context.PROVIDER_URL, "t3://220.73.135.71:8010");       //통합빌링(일반) 서버 URL
            //env.put(Context.PROVIDER_URL, "t3://220.73.135.71:8050");       //통합빌링(관리자) 서버 URL
            //env.put(Context.PROVIDER_URL, "t3://220.73.135.73:8030");       //회원통합 서버 URL
            //env.put(Context.PROVIDER_URL, "t3://220.73.135.55:7010");       //콜센터 서버 URL

            //InitialContext Setting
            env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
            env.put(Context.PROVIDER_URL, strUrl);                          //서버 URL
            env.put(Context.SECURITY_PRINCIPAL, strId);                     //아이디
            env.put(Context.SECURITY_CREDENTIALS, strPass);                 //패스워드
            Context ctx = new InitialContext(env);

            //Connect to Remote MBean server
            MBeanHome home = null;

            //어드민 서버로 세팅
            home  = (MBeanHome)ctx.lookup(MBeanHome.ADMIN_JNDI_NAME);
            RemoteMBeanServer rmbs = (RemoteMBeanServer)home.getMBeanServer();

            //Mbean의 리스트를 얻는다
            Set allMBeans = home.getMBeansByType("JDBCConnectionPoolRuntime");

            Iterator iter = allMBeans.iterator();
            boolean gotJDBC = false;

            WebLogicObjectName webObj = null;

            //모니터링할 런타임 객체를 생성
            JDBCConnectionPoolRuntimeMBean mbean = null;

            //SERVER2 모니터링 객체를 Setting 하기 위한 임시변수를 ARRAY로 선언
            String[] poolname        = new String[30];
            String[] svrname         = new String[30];
            int[]    conncurcnt      = new int[30];
            int[]    connhighcnt     = new int[30];
            int[]    conntotcnt      = new int[30];
            int[]    maxcapa         = new int[30];
            int[]    waitsechigh     = new int[30];
            int[]    waitforconncur  = new int[30];
            int[]    waitforconnhigh = new int[30];
            String[] state           = new String[30];

            //반복 COUNT
            int      hascount        = 0;
            //Array Set number
            int      setno           = 0;

            //화면구성에 따른 SET 구분
            //disclsf : A - POOL NAME,SERVER NAME    B - SERVER NAME,POOL NAME
            if (disclsf.equals("A")) {

                //반복작업 하면서 객체를 찾아 임시선언한 각각의 ARRRAY변수에 Setting 한다..
                while (iter.hasNext()) {
                	//COUNT 증가
                    hascount = hascount + 1;
                
                    //해당 모니터링 객체로 Casting
                    mbean = (JDBCConnectionPoolRuntimeMBean) iter.next();
                
                    //SERVER NAME 객체 Casting
                    webObj = (WebLogicObjectName)(mbean.getObjectName());
                
/*              
                    //각각의 서버별 CONNECTION POOL 구분
                    //판매지국 CONNECTION POOL
                    POOL NAME        SERVER NAME
                    CRMBO_SLS_1      agencysvr1
                    CRMBO_SLS_1      agencysvr2
                    CRMBO_SLS_2      agencysvr1
                    CRMBO_SLS_2      agencysvr2
                    CRMBO_BSNS_1     agencysvr1
                    CRMBO_BSNS_1     agencysvr2
                    CRMBO_BSNS_2     agencysvr1
                    CRMBO_BSNS_2     agencysvr2
                    
                    //판매국 CONNECTION POOL
                    POOL NAME        SERVER NAME
                    CRMBO_SLS_1      salesvr1
                    CRMBO_SLS_1      salesvr2
                    CRMBO_SLS_2      salesvr1
                    CRMBO_SLS_2      salesvr2
                    CRMBO_BSNS_1     salesvr1
                    CRMBO_BSNS_1     salesvr2
                    CRMBO_BSNS_2     salesvr1
                    CRMBO_BSNS_2     salesvr2
                    
                    //출판지사 CONNECTION POOL
                    POOL NAME        SERVER NAME
                    CRMBO_SLS_1      branchsvr1
                    CRMBO_SLS_1      branchsvr2
                    CRMBO_SLS_2      branchsvr1
                    CRMBO_SLS_2      branchsvr2
                    
                    //출판국 CONNECTION POOL
                    POOL NAME        SERVER NAME
                    CRMBO_SLS_1      publishsvr1
                    CRMBO_SLS_1      publishsvr2
                    CRMBO_SLS_2      publishsvr1
                    CRMBO_SLS_2      publishsvr2
                    
                    //통합빌링(일반) CONNECTION POOL
                    POOL NAME        SERVER NAME
                    CRMBIL_MIL1      bilsvr1
                    CRMBIL_MIL1      bilsvr2
                    CRMBIL_MIL2      bilsvr1
                    CRMBIL_MIL2      bilsvr2
                    CRMBIL_ON_1      bilsvr1
                    CRMBIL_ON_1      bilsvr2
                    CRMBIL_ON_2      bilsvr1
                    CRMBIL_ON_2      bilsvr2
                    CRMBIL_OFF1      bilsvr1
                    CRMBIL_OFF1      bilsvr2
                    CRMBIL_OFF2      bilsvr1
                    CRMBIL_OFF2      bilsvr2
                    
                    //통합빌링(관리) CONNECTION POOL
                    POOL NAME        SERVER NAME
                    CRMBIL_MIL1      biladmsvr1
                    CRMBIL_MIL1      biladmsvr2
                    CRMBIL_MIL2      biladmsvr1
                    CRMBIL_MIL2      biladmsvr2
                    CRMBIL_ON1       biladmsvr1
                    CRMBIL_ON1       biladmsvr2
                    CRMBIL_ON2       biladmsvr1
                    CRMBIL_ON2       biladmsvr2
                    CRMBIL_OFF1      biladmsvr1
                    CRMBIL_OFF1      biladmsvr2
                    CRMBIL_OFF2      biladmsvr1
                    CRMBIL_OFF2      biladmsvr2
                    
                    //회원통합 CONNECTION POOL
                    POOL NAME        SERVER NAME
                    OracleThin1      membershipsvr1
                    OracleThin1      membershipsvr2
                    OracleThin2      membershipsvr1
                    OracleThin2      membershipsvr2
                
                    //콜센터 CONNECTION POOL
                    POOL NAME        SERVER NAME
                    CRMSAL_CCT_POOL1 myserver
                    CRMSAL_CCT_POOL2 myserver
                    CRMBIL_CCT_POOL1 myserver
                    CRMBIL_CCT_POOL2 myserver
                    CRMSSO_CCT_POOL1 myserver
                    CRMSSO_CCT_POOL2 myserver
                    CRMCCT_CCT_POOL  myserver
                    CRMDW_CCT_POOL   myserver
*/              
                
                    //모니터링할 커넥션 풀이름,SERVER NAME 별로 ARRRAY변수에 순서대로(SORTING) Setting 한다.
                    if ((mbean.getName()).equals("CRMBO_SLS_1") || (mbean.getName()).equals("CRMBIL_MIL1") || (mbean.getName()).equals("CRMSAL_CCT_POOL1") || (mbean.getName()).equals("CRMSAL_CCT_POOL2") || (mbean.getName()).equals("OracleThin1")) {
                        if ("agencysvr2".equals(webObj.getLocation()) || "salesvr2".equals(webObj.getLocation()) || "branchsvr2".equals(webObj.getLocation()) || "publishsvr2".equals(webObj.getLocation()) || "bilsvr2".equals(webObj.getLocation()) || "biladmsvr2".equals(webObj.getLocation()) || (mbean.getName()).equals("CRMSAL_CCT_POOL2") || "membershipsvr2".equals(webObj.getLocation())) {
                            setno               = 1;
/*              
                            poolname[1]         = mbean.getName();
                            svrname[1]          = webObj.getLocation();
                            conncurcnt[1]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[1]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[1]       = mbean.getConnectionsTotalCount();
                            maxcapa[1]          = mbean.getMaxCapacity();
                            waitsechigh[1]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[1]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[1]  = mbean.getWaitingForConnectionHighCount();
                            state[1]            = mbean.getState();
*/              
                        } else {
                            setno               = 0;
/*              
                            poolname[0]         = mbean.getName();
                            svrname[0]          = webObj.getLocation();
                            conncurcnt[0]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[0]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[0]       = mbean.getConnectionsTotalCount();
                            maxcapa[0]          = mbean.getMaxCapacity();
                            waitsechigh[0]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[0]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[0]  = mbean.getWaitingForConnectionHighCount();
                            state[0]            = mbean.getState();
*/              
                        }
                    } else if ((mbean.getName()).equals("CRMBO_SLS_2") || (mbean.getName()).equals("CRMBIL_MIL2") || (mbean.getName()).equals("CRMBIL_CCT_POOL1") || (mbean.getName()).equals("CRMBIL_CCT_POOL2") || (mbean.getName()).equals("OracleThin2")) {
                        if ("agencysvr2".equals(webObj.getLocation()) || "salesvr2".equals(webObj.getLocation()) || "branchsvr2".equals(webObj.getLocation()) || "publishsvr2".equals(webObj.getLocation()) || "bilsvr2".equals(webObj.getLocation()) || "biladmsvr2".equals(webObj.getLocation()) || (mbean.getName()).equals("CRMBIL_CCT_POOL2") || "membershipsvr2".equals(webObj.getLocation())) {
                            setno               = 3;
/*              
                            poolname[3]         = mbean.getName();
                            svrname[3]          = webObj.getLocation();
                            conncurcnt[3]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[3]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[3]       = mbean.getConnectionsTotalCount();
                            maxcapa[3]          = mbean.getMaxCapacity();
                            waitsechigh[3]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[3]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[3]  = mbean.getWaitingForConnectionHighCount();
                            state[3]            = mbean.getState();
*/              
                        } else {
                            setno               = 2;
/*              
                            poolname[2]         = mbean.getName();
                            svrname[2]          = webObj.getLocation();
                            conncurcnt[2]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[2]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[2]       = mbean.getConnectionsTotalCount();
                            maxcapa[2]          = mbean.getMaxCapacity();
                            waitsechigh[2]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[2]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[2]  = mbean.getWaitingForConnectionHighCount();
                            state[2]            = mbean.getState();
*/              
                        }
                    } else if ((mbean.getName()).equals("CRMBO_BSNS_1") || (mbean.getName()).equals("CRMBIL_ON_1") || (mbean.getName()).equals("CRMBIL_ON1") || (mbean.getName()).equals("CRMSSO_CCT_POOL1") || (mbean.getName()).equals("CRMSSO_CCT_POOL2")) {
                        if ("agencysvr2".equals(webObj.getLocation()) || "salesvr2".equals(webObj.getLocation()) || "branchsvr2".equals(webObj.getLocation()) || "publishsvr2".equals(webObj.getLocation()) || "bilsvr2".equals(webObj.getLocation()) || "biladmsvr2".equals(webObj.getLocation()) || (mbean.getName()).equals("CRMSSO_CCT_POOL2")) {
                            setno               = 5;
/*              
                            poolname[5]         = mbean.getName();
                            svrname[5]          = webObj.getLocation();
                            conncurcnt[5]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[5]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[5]       = mbean.getConnectionsTotalCount();
                            maxcapa[5]          = mbean.getMaxCapacity();
                            waitsechigh[5]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[5]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[5]  = mbean.getWaitingForConnectionHighCount();
                            state[5]            = mbean.getState();
*/              
                        } else {
                            setno               = 4;
/*              
                            poolname[4]         = mbean.getName();
                            svrname[4]          = webObj.getLocation();
                            conncurcnt[4]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[4]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[4]       = mbean.getConnectionsTotalCount();
                            maxcapa[4]          = mbean.getMaxCapacity();
                            waitsechigh[4]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[4]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[4]  = mbean.getWaitingForConnectionHighCount();
                            state[4]            = mbean.getState();
*/              
                        }
                    } else if ((mbean.getName()).equals("CRMBO_BSNS_2") || (mbean.getName()).equals("CRMBIL_ON_2") || (mbean.getName()).equals("CRMBIL_ON2") || (mbean.getName()).equals("CRMCCT_CCT_POOL") || (mbean.getName()).equals("CRMDW_CCT_POOL")) {
                        if ("agencysvr2".equals(webObj.getLocation()) || "salesvr2".equals(webObj.getLocation()) || "branchsvr2".equals(webObj.getLocation()) || "publishsvr2".equals(webObj.getLocation()) || "bilsvr2".equals(webObj.getLocation()) || "biladmsvr2".equals(webObj.getLocation()) || (mbean.getName()).equals("CRMDW_CCT_POOL")) {
                            setno               = 7;
/*              
                            poolname[7]         = mbean.getName();
                            svrname[7]          = webObj.getLocation();
                            conncurcnt[7]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[7]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[7]       = mbean.getConnectionsTotalCount();
                            maxcapa[7]          = mbean.getMaxCapacity();
                            waitsechigh[7]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[7]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[7]  = mbean.getWaitingForConnectionHighCount();
                            state[7]            = mbean.getState();
*/              
                        } else {
                            setno               = 6;
/*              
                            poolname[6]         = mbean.getName();
                            svrname[6]          = webObj.getLocation();
                            conncurcnt[6]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[6]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[6]       = mbean.getConnectionsTotalCount();
                            maxcapa[6]          = mbean.getMaxCapacity();
                            waitsechigh[6]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[6]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[6]  = mbean.getWaitingForConnectionHighCount();
                            state[6]            = mbean.getState();
*/              
                        }
                    } else if ((mbean.getName()).equals("CRMBIL_OFF1")) {
                        if ("bilsvr2".equals(webObj.getLocation()) || "biladmsvr2".equals(webObj.getLocation())) {
                            setno               = 9;
/*              
                            poolname[9]         = mbean.getName();
                            svrname[9]          = webObj.getLocation();
                            conncurcnt[9]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[9]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[9]       = mbean.getConnectionsTotalCount();
                            maxcapa[9]          = mbean.getMaxCapacity();
                            waitsechigh[9]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[9]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[9]  = mbean.getWaitingForConnectionHighCount();
                            state[9]            = mbean.getState();
*/              
                        } else {
                            setno               = 8;
/*              
                            poolname[8]         = mbean.getName();
                            svrname[8]          = webObj.getLocation();
                            conncurcnt[8]       = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[8]      = mbean.getActiveConnectionsHighCount();
                            conntotcnt[8]       = mbean.getConnectionsTotalCount();
                            maxcapa[8]          = mbean.getMaxCapacity();
                            waitsechigh[8]      = mbean.getWaitSecondsHighCount();
                            waitforconncur[8]   = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[8]  = mbean.getWaitingForConnectionHighCount();
                            state[8]            = mbean.getState();
*/              
                        }
                    } else if ((mbean.getName()).equals("CRMBIL_OFF2")) {
                        if ("bilsvr2".equals(webObj.getLocation()) || "biladmsvr2".equals(webObj.getLocation())) {
                            setno               = 11;
/*              
                            poolname[11]        = mbean.getName();
                            svrname[11]         = webObj.getLocation();
                            conncurcnt[11]      = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[11]     = mbean.getActiveConnectionsHighCount();
                            conntotcnt[11]      = mbean.getConnectionsTotalCount();
                            maxcapa[11]         = mbean.getMaxCapacity();
                            waitsechigh[11]     = mbean.getWaitSecondsHighCount();
                            waitforconncur[11]  = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[11] = mbean.getWaitingForConnectionHighCount();
                            state[11]           = mbean.getState();
*/              
                        } else {
                            setno               = 10;
/*              
                            poolname[10]        = mbean.getName();
                            svrname[10]         = webObj.getLocation();
                            conncurcnt[10]      = mbean.getActiveConnectionsCurrentCount();
                            connhighcnt[10]     = mbean.getActiveConnectionsHighCount();
                            conntotcnt[10]      = mbean.getConnectionsTotalCount();
                            maxcapa[10]         = mbean.getMaxCapacity();
                            waitsechigh[10]     = mbean.getWaitSecondsHighCount();
                            waitforconncur[10]  = mbean.getWaitingForConnectionCurrentCount();
                            waitforconnhigh[10] = mbean.getWaitingForConnectionHighCount();
                            state[10]           = mbean.getState();
*/              
                        }
                    }
                
                    poolname[setno]        = mbean.getName();
                    svrname[setno]         = webObj.getLocation();
                    conncurcnt[setno]      = mbean.getActiveConnectionsCurrentCount();
                    connhighcnt[setno]     = mbean.getActiveConnectionsHighCount();
                    conntotcnt[setno]      = mbean.getConnectionsTotalCount();
                    maxcapa[setno]         = mbean.getMaxCapacity();
                    waitsechigh[setno]     = mbean.getWaitSecondsHighCount();
                    waitforconncur[setno]  = mbean.getWaitingForConnectionCurrentCount();
                    waitforconnhigh[setno] = mbean.getWaitingForConnectionHighCount();
                    state[setno]           = mbean.getState();
                
                }

            } else if (disclsf.equals("B")) {

                //반복작업 하면서 객체를 찾아 임시선언한 각각의 ARRRAY변수에 Setting 한다..
                while (iter.hasNext()) {
                	//COUNT 증가
                    hascount = hascount + 1;
                
                    //해당 모니터링 객체로 Casting
                    mbean = (JDBCConnectionPoolRuntimeMBean) iter.next();
                
                    //SERVER NAME 객체 Casting
                    webObj = (WebLogicObjectName)(mbean.getObjectName());
                
/*
                    //각각의 서버별 CONNECTION POOL 구분
                    //판매지국 CONNECTION POOL
                    SERVER NAME     POOL NAME         SER NO
                    agencysvr1      CRMBO_SLS_1       0
                    agencysvr1      CRMBO_SLS_2       1
                    agencysvr1      CRMBO_BSNS_1      2
                    agencysvr1      CRMBO_BSNS_2      3
                    agencysvr2      CRMBO_SLS_1       4
                    agencysvr2      CRMBO_SLS_2       5
                    agencysvr2      CRMBO_BSNS_1      6
                    agencysvr2      CRMBO_BSNS_2      7
                    
                    //판매국 CONNECTION POOL
                    SERVER NAME     POOL NAME         SER NO
                    salesvr1        CRMBO_SLS_1       0
                    salesvr1        CRMBO_SLS_2       1
                    salesvr1        CRMBO_BSNS_1      2
                    salesvr1        CRMBO_BSNS_2      3
                    salesvr2        CRMBO_SLS_1       4
                    salesvr2        CRMBO_SLS_2       5
                    salesvr2        CRMBO_BSNS_1      6
                    salesvr2        CRMBO_BSNS_2      7
                    
                    //출판지사 CONNECTION POOL
                    SERVER NAME     POOL NAME         SER NO
                    branchsvr1      CRMBO_SLS_1       0
                    branchsvr1      CRMBO_SLS_2       1
                    branchsvr2      CRMBO_SLS_1       2
                    branchsvr2      CRMBO_SLS_2       3
                    
                    //출판국 CONNECTION POOL
                    SERVER NAME     POOL NAME         SER NO
                    publishsvr1     CRMBO_SLS_1       0
                    publishsvr1     CRMBO_SLS_2       1
                    publishsvr2     CRMBO_SLS_1       2
                    publishsvr2     CRMBO_SLS_2       3
                    
                    //통합빌링(일반) CONNECTION POOL
                    SERVER NAME     POOL NAME         SER NO
                    bilsvr1         CRMBIL_MIL1       0
                    bilsvr1         CRMBIL_MIL2       1
                    bilsvr1         CRMBIL_ON_1       2
                    bilsvr1         CRMBIL_ON_2       3
                    bilsvr1         CRMBIL_OFF1       4
                    bilsvr1         CRMBIL_OFF2       5
                    bilsvr2         CRMBIL_MIL1       6
                    bilsvr2         CRMBIL_MIL2       7
                    bilsvr2         CRMBIL_ON_1       8
                    bilsvr2         CRMBIL_ON_2       9
                    bilsvr2         CRMBIL_OFF1       10
                    bilsvr2         CRMBIL_OFF2       11
                    
                    //통합빌링(관리) CONNECTION POOL
                    SERVER NAME     POOL NAME         SER NO
                    biladmsvr1      CRMBIL_MIL1       0
                    biladmsvr1      CRMBIL_MIL2       1
                    biladmsvr1      CRMBIL_ON1        2
                    biladmsvr1      CRMBIL_ON2        3
                    biladmsvr1      CRMBIL_OFF1       4
                    biladmsvr1      CRMBIL_OFF2       5
                    biladmsvr2      CRMBIL_MIL1       6
                    biladmsvr2      CRMBIL_MIL2       7
                    biladmsvr2      CRMBIL_ON1        8
                    biladmsvr2      CRMBIL_ON2        9
                    biladmsvr2      CRMBIL_OFF1       10
                    biladmsvr2      CRMBIL_OFF2       11
                    
                    //회원통합 CONNECTION POOL
                    SERVER NAME     POOL NAME         SER NO
                    membershipsvr1  OracleThin1       0
                    membershipsvr1  OracleThin2       1
                    membershipsvr2  OracleThin1       2
                    membershipsvr2  OracleThin2       3
                    
                    //콜센터 CONNECTION POOL
                    SERVER NAME     POOL NAME         SER NO
                    myserver        CRMSAL_CCT_POOL1  0
                    myserver        CRMSAL_CCT_POOL2  1
                    myserver        CRMBIL_CCT_POOL1  2
                    myserver        CRMBIL_CCT_POOL2  3
                    myserver        CRMSSO_CCT_POOL1  4
                    myserver        CRMSSO_CCT_POOL2  5
                    myserver        CRMCCT_CCT_POOL   6
                    myserver        CRMDW_CCT_POOL    7
*/                    
                    
                    if        ( ("agencysvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_SLS_1"))  ||
                                ("salesvr1".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBO_SLS_1"))  ||
                                ("branchsvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_SLS_1"))  ||
                                ("publishsvr1".equals(webObj.getLocation())    && (mbean.getName()).equals("CRMBO_SLS_1"))  ||
                                ("bilsvr1".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_MIL1"))  ||
                                ("biladmsvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_MIL1"))  ||
                                ("membershipsvr1".equals(webObj.getLocation()) && (mbean.getName()).equals("OracleThin1"))  ||
                                ("myserver".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMSAL_CCT_POOL1")) ) {
                         setno  =  0;
                    } else if ( ("agencysvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_SLS_2"))  ||
                                ("salesvr1".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBO_SLS_2"))  ||
                                ("branchsvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_SLS_2"))  ||
                                ("publishsvr1".equals(webObj.getLocation())    && (mbean.getName()).equals("CRMBO_SLS_2"))  ||
                                ("bilsvr1".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_MIL2"))  ||
                                ("biladmsvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_MIL2"))  ||
                                ("membershipsvr1".equals(webObj.getLocation()) && (mbean.getName()).equals("OracleThin2"))  ||
                                ("myserver".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMSAL_CCT_POOL2")) ) {
                         setno  =  1;
                    } else if ( ("agencysvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_BSNS_1")) ||
                                ("salesvr1".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBO_BSNS_1")) ||
                                ("branchsvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_SLS_1"))  ||
                                ("publishsvr2".equals(webObj.getLocation())    && (mbean.getName()).equals("CRMBO_SLS_1"))  ||
                                ("bilsvr1".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_ON_1"))  ||
                                ("biladmsvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_ON1"))   ||
                                ("membershipsvr2".equals(webObj.getLocation()) && (mbean.getName()).equals("OracleThin1"))  ||
                                ("myserver".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBIL_CCT_POOL1")) ) {
                         setno  =  2;
                    } else if ( ("agencysvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_BSNS_2")) ||
                                ("salesvr1".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBO_BSNS_2")) ||
                                ("branchsvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_SLS_2"))  ||
                                ("publishsvr2".equals(webObj.getLocation())    && (mbean.getName()).equals("CRMBO_SLS_2"))  ||
                                ("bilsvr1".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_ON_2"))  ||
                                ("biladmsvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_ON2"))   ||
                                ("membershipsvr2".equals(webObj.getLocation()) && (mbean.getName()).equals("OracleThin2"))  ||
                                ("myserver".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBIL_CCT_POOL2")) ) {
                         setno  =  3;
                    } else if ( ("agencysvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_SLS_1"))  ||
                                ("salesvr2".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBO_SLS_1"))  ||
                                ("bilsvr1".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_OFF1"))  ||
                                ("biladmsvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_OFF1"))  ||
                                ("myserver".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMSSO_CCT_POOL1")) ) {
                         setno  =  4;
                    } else if ( ("agencysvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_SLS_2"))  ||
                                ("salesvr2".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBO_SLS_2"))  ||
                                ("bilsvr1".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_OFF2"))  ||
                                ("biladmsvr1".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_OFF2"))  ||
                                ("myserver".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMSSO_CCT_POOL2")) ) {
                         setno  =  5;
                    } else if ( ("agencysvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_BSNS_1")) ||
                                ("salesvr2".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBO_BSNS_1")) ||
                                ("bilsvr2".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_MIL1"))  ||
                                ("biladmsvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_MIL1"))  ||
                                ("myserver".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMCCT_CCT_POOL"))  ) {
                         setno  =  6;
                    } else if ( ("agencysvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBO_BSNS_2")) ||
                                ("salesvr2".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMBO_BSNS_2")) ||
                                ("bilsvr2".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_MIL2"))  ||
                                ("biladmsvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_MIL2"))  ||
                                ("myserver".equals(webObj.getLocation())       && (mbean.getName()).equals("CRMDW_CCT_POOL"))   ) {
                         setno  =  7;
                    } else if ( ("bilsvr2".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_ON_1"))  ||
                                ("biladmsvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_ON1"))       ) {
                         setno  =  8;
                    } else if ( ("bilsvr2".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_ON_2"))  ||
                                ("biladmsvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_ON2"))       ) {
                         setno  =  9;
                    } else if ( ("bilsvr2".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_OFF1"))  ||
                                ("biladmsvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_OFF1"))      ) {
                         setno  =  10;
                    } else if ( ("bilsvr2".equals(webObj.getLocation())        && (mbean.getName()).equals("CRMBIL_OFF2"))  ||
                                ("biladmsvr2".equals(webObj.getLocation())     && (mbean.getName()).equals("CRMBIL_OFF2"))      ) {
                         setno  =  11;
                    }

                    poolname[setno]        = mbean.getName();
                    svrname[setno]         = webObj.getLocation();
                    conncurcnt[setno]      = mbean.getActiveConnectionsCurrentCount();
                    connhighcnt[setno]     = mbean.getActiveConnectionsHighCount();
                    conntotcnt[setno]      = mbean.getConnectionsTotalCount();
                    maxcapa[setno]         = mbean.getMaxCapacity();
                    waitsechigh[setno]     = mbean.getWaitSecondsHighCount();
                    waitforconncur[setno]  = mbean.getWaitingForConnectionCurrentCount();
                    waitforconnhigh[setno] = mbean.getWaitingForConnectionHighCount();
                    state[setno]           = mbean.getState();
                
                }

            }
            
            //임시로 Setting한 ARRAY변수의 값들을 ArrayList로 Setting 리턴한다.
            for (int i=0 ; i<hascount ; i++) {
                JDBCAttributeMonitorRec rec = new JDBCAttributeMonitorRec();

                rec.poolname         =  poolname[i];
                rec.svrname          =  svrname[i];
                rec.conncurcnt       =  conncurcnt[i];
                rec.connhighcnt      =  connhighcnt[i];
                rec.conntotcnt       =  conntotcnt[i];
                rec.maxcapa          =  maxcapa[i];
                rec.waitsechigh      =  waitsechigh[i];
                rec.waitforconncur   =  waitforconncur[i];
                rec.waitforconnhigh  =  waitforconnhigh[i];
                rec.state            =  state[i];

/*
                System.out.println("");
                System.out.println("*************************************");
                System.out.println("poolname="+poolname[i]);
                System.out.println("svrname="+svrname[i]);
                System.out.println("conncurcnt="+conncurcnt[i]);
                System.out.println("connhighcnt="+connhighcnt[i]);
                System.out.println("conntotcnt="+conntotcnt[i]);
                System.out.println("maxcapa="+maxcapa[i]);
                System.out.println("waitsechigh="+waitsechigh[i]);
                System.out.println("waitforconncur="+waitforconncur[i]);
                System.out.println("waitforconnhigh="+waitforconnhigh[i]);
                System.out.println("state="+state[i]);
                System.out.println("*************************************");
                System.out.println("");
*/

                //ArrayList로 Set
                monitorlist.add(rec);

           }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //ArrayList Return
        return monitorlist;

    }

}


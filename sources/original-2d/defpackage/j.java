package defpackage;

/* JADX INFO: loaded from: original-2d.jar:j.class */
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static boolean f255f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static boolean f256g;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private static int[] f257q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private static int[] f258r;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static boolean f259h;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int[][] f262c;
    private static int x;
    private static int y;
    private static int z;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static boolean f270i;
    private static boolean j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static boolean f271k;
    private static int D;
    private static int E;
    private static int H;
    private static int I;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public static int f273k;

    /* JADX INFO: renamed from: s, reason: collision with other field name */
    private static int[] f274s;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static int[][] f278e;

    /* JADX INFO: renamed from: v, reason: collision with other field name */
    private static int[] f283v;
    public static boolean a = true;
    public static boolean b = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final int f245a = k.aH;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static final int f246b = k.aI;
    public static final int c = f245a - 0;
    public static int d = 30000;
    private static int m = 0;
    private static int n = 0;
    private static int o = 0;
    private static final int[] k = {100, 100, 100, 100, 50, 100, 20, 90, 10, 70, 0, 50, 0, 30, 0, 0};
    private static final int[] l = new int[64];
    public static final int e = 2 * (f245a + f246b);
    public static final int f = k.f;
    public static final int g = k.g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final int[] f247a = {0, 229, 458, 687, 916, 1145, 1374, 1603, 1832, 2061, 2290, 2519, 2748, 2976, 3205, 3433, 3662, 3890, 4118, 4346, 4574, 4802, 5029, 5257, 5484, 5711, 5938, 6165, 6391, 6618, 6844, 7070, 7296, 7521, 7746, 7971, 8196, 8421, 8645, 8869, 9093, 9317, 9540, 9763, 9986, 10208, 10431, 10652, 10874, 11095, 11316, 11537, 11757, 11977, 12197, 12416, 12635, 12853, 13071, 13289, 13507, 13724, 13940, 14157, 14373, 14588, 14803, 15018, 15232, 15446, 15660, 15873, 16085, 16297, 16509, 16720, 16931, 17142, 17352, 17561, 17770, 17979, 18187, 18394, 18601, 18808, 19014, 19220, 19425, 19630, 19834, 20038, 20241, 20444, 20646, 20848, 21049, 21250, 21450, 21649, 21848, 22047, 22245, 22443, 22640, 22836, 23032, 23227, 23422, 23616, 23810, 24003, 24196, 24388, 24580, 24771, 24961, 25151, 25340, 25529, 25717, 25905, 26092, 26278, 26464, 26649, 26834, 27018, 27202, 27385, 27568, 27750, 27931, 28112, 28292, 28471, 28650, 28829, 29007, 29184, 29361, 29537, 29712, 29887, 30062, 30236, 30409, 30582, 30754, 30925, 31096, 31266, 31436, 31605, 31774, 31942, 32109, 32276, 32442, 32608, 32773, 32938, 33101, 33265, 33428, 33590, 33751, 33913, 34073, 34233, 34392, 34551, 34709, 34867, 35024, 35180, 35336, 35492, 35646, 35801, 35954, 36107, 36260, 36412, 36563, 36714, 36864, 37014, 37163, 37312, 37460, 37607, 37754, 37901, 38047, 38192, 38337, 38481, 38624, 38768, 38910, 39052, 39194, 39335, 39475, 39615, 39754, 39893, 40032, 40169, 40307, 40443, 40580, 40715, 40850, 40985, 41119, 41253, 41386, 41519, 41651, 41782, 41913, 42044, 42174, 42303, 42432, 42561, 42689, 42817, 42944, 43070, 43196, 43322, 43447, 43572, 43696, 43819, 43943, 44065, 44188, 44309, 44431, 44551, 44672, 44792, 44911, 45030, 45148, 45266, 45384, 45501, 45618, 45734, 45849, 45965};

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static final int[] f248m = {0, -1, 0, 1, 0, 1, 0, -1};

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static final int[] f249n = {-1, 0, 1, 0, 1, 0, -1, 0};

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private static final int[] f250o = {0, 1, 0, -1, 0};
    private static final int[] p = {1, 0, -1, 0, 0};

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private static int f251p = 0;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static boolean f252c = false;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static boolean f253d = false;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static boolean f254e = false;
    public static int h = 0;
    public static int i = 0;
    private static int q = 0;
    private static int r = 0;
    private static int s = 0;
    private static int t = 0;
    private static int u = 0;
    private static int v = 1;
    private static int w = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int[][] f260a = {new int[]{1925, 1931, 1927, 1927, 1927, 1921, 1914, 1914, 1910, 1904, 1898, 1896, 1890, 1883, 1883, 1877, 1870, 1862, 1858, 1853}, new int[]{1896, 1892, 1901, 1907, 1916, 1916, 1918, 1923, 1925, 1932, 1932, 1934, 1942, 1945, 1951, 1953, 1955, 1955, 1955, 1957}, new int[]{1819, 1814, 1817, 1822, 1826, 1824, 1827, 1821, 1819, 1821, 1821, 1824, 1824, 1827, 1826, 1827, 1827, 1822, 1819, 1817}, new int[]{1838, 1828, 1833, 1835, 1835, 1835, 1833, 1827, 1828, 1832, 1832, 1828, 1832, 1835, 1836, 1839, 1841, 1838, 1833, 1835}, new int[]{1864, 1858, 1853, 1853, 1852, 1846, 1838, 1834, 1828, 1822, 1819, 1819, 1819, 1818, 1821, 1821, 1817, 1814, 1812, 1815}, new int[]{1814, 1903, 1901, 1900, 1896, 1896, 1891, 1891, 1887, 1889, 1893, 1894, 1904, 1911, 1921, 1928, 1938, 1947, 1954, 1851}, new int[]{1915, 1892, 1883, 1876, 1867, 1853, 1844, 1842, 1836, 1837, 1835, 1833, 1842, 1844, 1853, 1863, 1873, 1881, 1890, 1901}, new int[]{2156, 2124, 2112, 2093, 2076, 2062, 2049, 2040, 2034, 2026, 2028, 2034, 2039, 2048, 2060, 2076, 2093, 2108, 2121, 2136}};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int[][] f261b = {new int[]{2151, 1908, 1992, 2065, 2140, 2204, 2153, 1910, 1822, 0, 0, 1780, 1909, 2153, 2204, 2147, 2072, 1996, 1914, 2147}, new int[]{1800, 2131, 1890, 1974, 2019, 2062, 2115, 2104, 2075, 15692, 14485, 2149, 2143, 2125, 2051, 1987, 1934, 1846, 2073, 1752}, new int[]{1758, 1694, 1722, 1777, 1858, 1821, 1902, 1941, 1908, 0, 0, 1850, 1930, 1897, 1837, 1882, 1813, 1763, 1741, 1796}, new int[]{1674, 1662, 1606, 1646, 1713, 1717, 1849, 2000, 2086, 9323, 9257, 2086, 2001, 1858, 1720, 1711, 1643, 1604, 1661, 1664}, new int[]{1907, 1784, 1748, 1684, 1661, 1697, 1848, 1939, 2142, 0, 0, 2147, 1936, 1848, 1701, 1665, 1687, 1744, 1780, 1893}, new int[]{2092, 2032, 1951, 1900, 1852, 1746, 1783, 2011, 2436, 7955, 7912, 2560, 2006, 1779, 1739, 1843, 1891, 1939, 2017, 2064}, new int[]{2748, 2608, 2533, 2467, 2357, 2255, 2163, 2772, 3842, 0, 0, 3787, 2778, 2172, 2268, 2376, 2497, 2570, 2651, 2773}, new int[]{6498, 6240, 6016, 5812, 5602, 5346, 5167, 5010, 4936, 1395, 1395, 4936, 5012, 5165, 5338, 5590, 5794, 5995, 6210, 6425}};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int[] f263b = {6, 4, 1, 8, 564133920, 564133921, 563085314, 563085315, 4, 1, 15, 564133888, 564133889, 564133922, 564133923, 4, 1, 22, 564133920, 564133889, 564133922, 564133891, 4, 1, 29, 563085312, 563085345, 563085314, 563085347, 3, 1, 35, 1099956224, 564133922, 564133891, 2, 1, 1, 1099956225, 1099956227};

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int[] f264c = {4, 2, 1, 6, 1101004800, 1101004865, 2, 1, 11, 1101004864, 1101004801, 4, 1, 18, 563085312, 563085376, 563085345, 563085409, 2, 1, 1, 1101004801, 1101004865};

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static int[] f265d = {11, 4, 1, 8, 563085312, 563085408, 563085315, 563085411, 4, 1, 15, 563085313, 564133953, 563085346, 564133986, 5, 1, 23, 563085312, 563085408, 1637875745, 563085315, 563085411, 4, 1, 30, 1637875712, 1636827200, 1637875714, 1636827202, 2, 1, 35, 1636827200, 1636827138, 2, 1, 40, 1637875712, 1637875778, 4, 1, 47, 1099956288, 1099956225, 1099956290, 1099956227, 4, 1, 54, 1101004800, 1101004865, 1101004802, 1101004867, 4, 1, 61, 1101004800, 1101004864, 1101004802, 1101004866, 4, 1, 68, 1101004800, 564133984, 564133891, 1101004867, 4, 1, 1, 564133888, 1101004864, 1101004803, 564133987};

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static int[] f266e = {26, 4, 1, 8, 1637875776, 1637875714, 1637875842, 1637875780, 5, 1, 16, 1637875712, 1637875840, 1637875778, 1637875716, 1637875844, 7, 1, 26, 1099956288, 1099956225, 1099956353, 1637875778, 1099956228, 1099956356, 1099956293, 7, 1, 36, 1636827200, 1099956225, 1099956353, 1101004804, 1101004932, 564133893, 564134053, 16, 1, 55, 1101004800, 1101004864, 1101004928, 564133889, 564134049, 564133890, 564134050, 564133891, 564133955, 564134051, 564133892, 564133956, 564134052, 1101004805, 564133957, 564134053, 10, 1, 68, 1101004832, 1101004896, 564133921, 564134017, 1099956227, 1099956355, 563085348, 563085444, 563085349, 563085445, 8, 1, 79, 1101004800, 1101004864, 1637875840, 564133889, 564133890, 564133891, 1637875716, 1101004933, 18, 1, 100, 564133889, 564133921, 564133953, 564133985, 564134017, 564134049, 564133891, 564133923, 564133955, 564133987, 564134019, 564134051, 563085317, 563085349, 563085381, 563085413, 563085445, 563085477, 12, 1, 115, 564133888, 563085408, 564133921, 563085441, 564133954, 563085474, 563085315, 564133987, 563085348, 564134020, 563085381, 564134053, 8, 2, 126, 1110443008, 1110443072, 1637875840, 573572097, 573572098, 573572099, 1637875716, 1101004933, 18, 2, 147, 573572128, 573572192, 573572256, 573572129, 573572193, 573572257, 573572130, 573572194, 573572258, 573572131, 573572195, 573572259, 573572132, 573572196, 573572260, 573572133, 573572197, 573572261, 18, 2, 168, 564133920, 573572192, 564134048, 573572129, 564133985, 573572257, 564133922, 573572194, 564134050, 573572131, 564133987, 573572259, 564133924, 573572196, 564134052, 573572133, 564133989, 573572261, 12, 2, 183, 573572160, 564134048, 573572129, 564134017, 573572098, 564133986, 564133955, 573572259, 564133924, 573572228, 564133893, 573572197, 7, 2, 193, 1110443072, 1110443009, 1110443137, 1637875778, 1110443012, 1110443140, 1110443077, 8, 2, 204, 1110443008, 1110443136, 1101004865, 1647313922, 1647314050, 1101004868, 1110443013, 1110443141, 16, 2, 223, 1110443008, 1110443072, 1110443136, 573572097, 573572257, 573572098, 573572258, 573572099, 573572163, 573572259, 573572100, 573572164, 573572260, 1110443013, 573572165, 573572261, 10, 3, 236, 1119882272, 1119882336, 573572129, 573572225, 1119882243, 1119882371, 573572132, 573572228, 573572133, 573572229, 8, 3, 247, 1119882240, 1119882304, 1656753280, 583011329, 583011330, 583011331, 1656753156, 1119882373, 8, 3, 258, 1110443008, 1110443072, 1656753280, 573572097, 573572098, 573572099, 1656753156, 1110443141, 18, 3, 279, 564133889, 564133921, 564133953, 564133985, 564134017, 564134049, 564133891, 573572131, 564133955, 573572195, 564134019, 573572259, 583011333, 564133925, 583011397, 564133989, 583011461, 564134053, 18, 3, 300, 573572096, 573572128, 573572160, 573572192, 573572224, 573572256, 583011330, 583011362, 583011394, 583011426, 583011458, 583011490, 573572100, 573572132, 573572164, 573572196, 573572228, 573572260, 18, 3, 321, 583011329, 583011361, 583011393, 583011425, 583011457, 583011489, 573572099, 573572131, 573572163, 573572195, 573572227, 573572259, 583011333, 583011365, 583011397, 583011429, 583011461, 583011493, 18, 3, 342, 583011328, 583011392, 583011456, 583011329, 583011393, 583011457, 583011330, 583011394, 583011458, 583011331, 583011395, 583011459, 583011332, 583011396, 583011460, 583011333, 583011397, 583011461, 12, 3, 357, 573572096, 583011424, 573572129, 583011457, 573572162, 583011490, 583011331, 573572195, 583011364, 573572228, 583011397, 573572261, 7, 3, 367, 1110443072, 1110443009, 1110443137, 1656753218, 1110443012, 1110443140, 1110443077, 16, 3, 1, 1119882240, 1119882304, 1119882368, 583011329, 583011489, 583011330, 583011490, 583011331, 583011395, 583011491, 583011332, 583011396, 583011492, 1119882245, 583011397, 583011493};

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static int[] f267f = {4, 2, 1, 6, 1637875712, 1637875840, 6, 1, 15, 563085344, 563085408, 563085472, 563085313, 563085377, 563085441, 3, 1, 21, 1099956288, 1099956225, 1099956353, 3, 1, 1, 1099956224, 1099956352, 1099956289};

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static int[] f268g = {19, 12, 1, 16, 564133888, 564133984, 564133889, 564133985, 564133890, 564133986, 564133891, 564133987, 564133892, 564133988, 564133893, 564133989, 6, 1, 25, 1101004800, 1101004801, 1101004802, 1101004803, 1101004804, 1101004805, 6, 1, 34, 1101004800, 1101004801, 1101004865, 1101004804, 1101004868, 1101004805, 6, 1, 43, 1101004864, 1101004801, 1101004865, 1101004804, 1101004868, 1101004869, 6, 1, 52, 1101004864, 1101004865, 1101004866, 1101004867, 1101004868, 1101004869, 3, 1, 58, 1637875712, 1637875714, 1637875716, 3, 1, 64, 1637875776, 1637875778, 1637875780, 12, 2, 79, 564133888, 573572192, 573572097, 564133985, 564133890, 573572194, 573572099, 564133987, 564133892, 573572196, 573572101, 564133989, 6, 2, 88, 1101004800, 1101004801, 1110443010, 1110443011, 1101004804, 1101004805, 6, 2, 97, 1101004864, 1101004865, 1110443074, 1110443075, 1101004868, 1101004869, 6, 2, 106, 1101004800, 1110443009, 1110443073, 1110443012, 1110443076, 1101004805, 6, 2, 115, 1101004864, 1110443009, 1110443073, 1110443012, 1110443076, 1101004869, 3, 2, 121, 1647313920, 1637875714, 1647313924, 3, 2, 127, 1647313984, 1637875778, 1647313988, 12, 3, 142, 564133888, 583011424, 583011329, 564133985, 564133890, 583011426, 583011331, 564133987, 564133892, 583011428, 583011333, 564133989, 6, 3, 151, 1101004800, 1110443009, 1119882242, 1119882243, 1110443012, 1101004805, 6, 3, 160, 1101004864, 1110443073, 1119882306, 1119882307, 1110443076, 1101004869, 3, 3, 166, 1656753152, 1637875714, 1656753156, 3, 3, 1, 1656753216, 1637875778, 1656753220};

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static int[] f269h = {19, 16, 1, 20, 564133888, 564133984, 564133889, 564133985, 564133890, 564133986, 564133891, 564133987, 564133892, 564133988, 564133893, 564133989, 564133894, 564133990, 564133895, 564133991, 8, 1, 31, 1101004800, 1101004801, 1101004802, 1101004803, 1101004804, 1101004805, 1101004806, 1101004807, 8, 1, 42, 1101004800, 1101004801, 1101004802, 1101004866, 1101004805, 1101004869, 1101004806, 1101004807, 8, 1, 53, 1101004864, 1101004865, 1101004802, 1101004866, 1101004805, 1101004869, 1101004870, 1101004871, 8, 1, 64, 1101004864, 1101004865, 1101004866, 1101004867, 1101004868, 1101004869, 1101004870, 1101004871, 4, 1, 71, 1637875712, 1637875714, 1637875716, 1637875718, 4, 1, 78, 1637875776, 1637875778, 1637875780, 1637875782, 16, 2, 97, 564133888, 573572192, 573572097, 564133985, 564133890, 573572194, 573572099, 564133987, 564133892, 573572196, 573572101, 564133989, 564133894, 573572198, 573572103, 564133991, 8, 2, 108, 1101004800, 1101004801, 1101004802, 1110443011, 1110443012, 1101004805, 1101004806, 1101004807, 8, 2, 119, 1101004864, 1101004865, 1101004866, 1110443075, 1110443076, 1101004869, 1101004870, 1101004871, 8, 2, 130, 1101004800, 1101004801, 1110443010, 1110443074, 1110443013, 1110443077, 1101004806, 1101004807, 8, 2, 141, 1101004864, 1101004865, 1110443010, 1110443074, 1110443013, 1110443077, 1101004870, 1101004871, 4, 2, 148, 1647313920, 1637875714, 1637875716, 1647313926, 4, 2, 155, 1647313984, 1637875778, 1637875780, 1647313990, 16, 3, 174, 564133888, 583011424, 583011329, 564133985, 564133890, 583011426, 583011331, 564133987, 564133892, 583011428, 583011333, 564133989, 564133894, 583011430, 583011335, 564133991, 8, 3, 185, 1101004800, 1101004801, 1110443010, 1119882243, 1119882244, 1110443013, 1101004806, 1101004807, 8, 3, 196, 1101004864, 1101004865, 1110443074, 1119882307, 1119882308, 1110443077, 1101004870, 1101004871, 4, 3, 203, 1656753152, 1637875714, 1637875716, 1656753158, 4, 3, 1, 1656753216, 1637875778, 1637875780, 1656753222};

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public static int f272j = 0;
    private static int A = 0;
    private static int B = 0;
    private static int C = 0;
    private static int F = 0;
    private static int G = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][][] f275a = {new int[][]{new int[]{2, 6}, new int[]{0, 6}, new int[]{0, 4}}, new int[][]{new int[]{0, 2}, new int[]{0, 0}, new int[]{6, 4}}, new int[][]{new int[]{0, 4}, new int[]{2, 4}, new int[]{2, 6}}};

    /* JADX INFO: renamed from: t, reason: collision with other field name */
    private static int[] f276t = new int[e + 200];

    /* JADX INFO: renamed from: u, reason: collision with other field name */
    private static int[] f277u = new int[e + 200];

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static int[][] f279d = {new int[]{0, 20000, 60000, 0}, new int[]{8, 30000, 80000, 0, 1, (0 + (c / 2)) - 1, 3, 1, (0 + (c / 2)) + 0, 3, 1, (0 + (c / 2)) - 1, 5, 1, (0 + (c / 2)) + 0, 5, 1, (0 + (c / 2)) - 1, 7, 1, (0 + (c / 2)) + 0, 7, 1, (0 + (c / 2)) - 1, 9, 1, (0 + (c / 2)) + 0, 9}, new int[]{16, 40000, 90000, 0, 1, (0 + (c / 2)) - 8, 5, 1, (0 + (c / 2)) - 3, 5, 1, (0 + (c / 2)) + 2, 5, 1, (0 + (c / 2)) + 7, 5, 1, (0 + (c / 2)) - 8, 6, 1, (0 + (c / 2)) - 3, 6, 1, (0 + (c / 2)) + 2, 6, 1, (0 + (c / 2)) + 7, 6, 1, (0 + (c / 2)) - 8, 7, 1, (0 + (c / 2)) - 3, 7, 1, (0 + (c / 2)) + 2, 7, 1, (0 + (c / 2)) + 7, 7, 1, (0 + (c / 2)) - 8, 8, 1, (0 + (c / 2)) - 3, 8, 1, (0 + (c / 2)) + 2, 8, 1, (0 + (c / 2)) + 7, 8}, new int[]{12, 50000, 110000, 0, 1, (0 + (c / 2)) - 3, 6, 1, (0 + (c / 2)) - 2, 6, 1, (0 + (c / 2)) - 1, 6, 1, (0 + (c / 2)) + 0, 6, 1, (0 + (c / 2)) + 1, 6, 1, (0 + (c / 2)) + 2, 6, 1, (0 + (c / 2)) - 3, 7, 1, (0 + (c / 2)) - 2, 7, 1, (0 + (c / 2)) - 1, 7, 1, (0 + (c / 2)) + 0, 7, 1, (0 + (c / 2)) + 1, 7, 1, (0 + (c / 2)) + 2, 7}, new int[]{12, 60000, 120000, 0, 1, (0 + (c / 2)) - 1, 4, 1, (0 + (c / 2)) + 0, 4, 1, (0 + (c / 2)) - 4, 6, 1, (0 + (c / 2)) - 3, 6, 1, (0 + (c / 2)) + 2, 6, 1, (0 + (c / 2)) + 3, 6, 1, (0 + (c / 2)) - 4, 7, 1, (0 + (c / 2)) - 3, 7, 1, (0 + (c / 2)) + 2, 7, 1, (0 + (c / 2)) + 3, 7, 1, (0 + (c / 2)) - 1, 9, 1, (0 + (c / 2)) + 0, 9}, new int[]{18, 80000, 150000, 0, 1, (0 + (c / 2)) - 4, 4, 1, (0 + (c / 2)) - 3, 4, 1, (0 + (c / 2)) + 2, 4, 1, (0 + (c / 2)) + 3, 4, 1, (0 + (c / 2)) - 8, 5, 1, (0 + (c / 2)) + 7, 5, 1, (0 + (c / 2)) - 1, 5, 1, (0 + (c / 2)) + 0, 5, 1, (0 + (c / 2)) - 8, 6, 1, (0 + (c / 2)) + 7, 6, 1, (0 + (c / 2)) - 1, 7, 1, (0 + (c / 2)) + 0, 7, 1, (0 + (c / 2)) - 8, 7, 1, (0 + (c / 2)) + 7, 7, 1, (0 + (c / 2)) - 4, 9, 1, (0 + (c / 2)) - 3, 9, 1, (0 + (c / 2)) + 2, 9, 1, (0 + (c / 2)) + 3, 9}, new int[]{20, 100000, 200000, 0, 1, (0 + (c / 2)) - 5, 4, 1, (0 + (c / 2)) - 4, 4, 1, (0 + (c / 2)) + 3, 4, 1, (0 + (c / 2)) + 4, 4, 1, (0 + (c / 2)) - 3, 5, 1, (0 + (c / 2)) - 2, 5, 1, (0 + (c / 2)) + 1, 5, 1, (0 + (c / 2)) + 2, 5, 1, (0 + (c / 2)) - 1, 6, 1, (0 + (c / 2)) + 0, 6, 1, (0 + (c / 2)) - 1, 7, 1, (0 + (c / 2)) + 0, 7, 1, (0 + (c / 2)) - 3, 8, 1, (0 + (c / 2)) - 2, 8, 1, (0 + (c / 2)) + 1, 8, 1, (0 + (c / 2)) + 2, 8, 1, (0 + (c / 2)) - 5, 9, 1, (0 + (c / 2)) - 4, 9, 1, (0 + (c / 2)) + 3, 9, 1, (0 + (c / 2)) + 4, 9}, new int[]{12, 150000, 300000, 0, 1, (0 + (c / 2)) - 8, 9, 1, (0 + (c / 2)) - 7, 9, 1, (0 + (c / 2)) - 6, 9, 1, (0 + (c / 2)) - 5, 9, 1, (0 + (c / 2)) - 2, 9, 1, (0 + (c / 2)) - 1, 9, 1, (0 + (c / 2)) + 0, 9, 1, (0 + (c / 2)) + 1, 9, 1, (0 + (c / 2)) + 4, 9, 1, (0 + (c / 2)) + 5, 9, 1, (0 + (c / 2)) + 6, 9, 1, (0 + (c / 2)) + 7, 9}};

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static int[] f280i = f279d[0];

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public static int f281l = 0;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public static int[] f282j = null;

    private static void d() {
        f257q = new int[32];
        f258r = new int[4];
        f278e = new int[8][c];
        f274s = new int[8];
        f283v = new int[2 * (f279d.length - 1)];
        f262c = new int[8][c];
    }

    public static void a() {
        n = 0;
        o = 1;
    }

    public static void b() {
        o++;
    }

    public static void a(int i2, int i3, int i4, int i5, int i6) {
        int[][] iArr;
        if (i2 == 0) {
            iArr = f260a;
        } else if (i2 == 1) {
            iArr = f261b;
        } else if (i2 != 2) {
            return;
        } else {
            iArr = f262c;
        }
        n += a(iArr, i3, i4, 0, 0, i5 - 0, i6 - 3);
    }

    public static void c() {
        int i2 = 0;
        int i3 = 0;
        m++;
        switch (DCWall.f19h) {
            case 1:
            case 2:
            case 3:
            case 4:
                i2 = (50 * d) / 100;
                i3 = (150 * d) / 100;
                break;
        }
        new StringBuffer().append("threshold min ").append(i2).toString();
        new StringBuffer().append("threshold max ").append(i3).toString();
        int i4 = n / o;
        new StringBuffer().append("old performance was ").append(d).append(" and the current performance was ").append(i4).toString();
        if (i4 <= i2) {
            i4 = i2;
        } else if (i4 >= i3) {
            i4 = i3;
        }
        d = ((d * m) + i4) / (m + 1);
        d = Math.max(30000, Math.min(3000000, d));
        new StringBuffer().append("new performance is ").append(d).toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m61a() {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        switch (DCWall.f19h) {
            case 1:
                i2 = 30000;
                i3 = 60000;
                i4 = 30000;
                i5 = 45000;
                break;
            case 2:
                i2 = 40000;
                i3 = 80000;
                i4 = 40000;
                i5 = 60000;
                break;
            case 3:
                i2 = 50000;
                i3 = 100000;
                i4 = 50000;
                i5 = 100000;
                break;
            case 4:
                i2 = 80000;
                i3 = 320000;
                i4 = 80000;
                i5 = 3000000;
                break;
        }
        int iMax = Math.max(i4, Math.min(i5, (((i5 - i4) * (d - i2)) / (i3 - i2)) + i4));
        new StringBuffer().append("getDifficulty() == ").append(iMax).toString();
        return iMax;
    }

    public static int a(int i2, int i3, int i4, boolean z2) {
        if (a) {
            d();
            a = false;
        }
        return b(i4, i2, i3, z2);
    }

    private static int b(int i2, int i3, int i4, boolean z2) {
        int[][] iArr = (int[][]) null;
        f255f = false;
        f256g = false;
        int iA = a(0, 0, 0, 10, 8, 10);
        b(iA);
        int i5 = 0;
        int i6 = -1;
        if (DCWall.f19h == 4) {
            while (i6 == -1) {
                switch (Math.abs(k.a.nextInt()) % 3) {
                    case 0:
                        i5 = 0;
                        i6 = u;
                        iArr = f260a;
                        break;
                    case 1:
                        i5 = 1;
                        i6 = v;
                        iArr = f261b;
                        break;
                    case 2:
                        i5 = 2;
                        i6 = w;
                        iArr = f262c;
                        break;
                }
            }
            f280i = f279d[i6];
        } else {
            f280i = f279d[u];
            iArr = f260a;
        }
        h = 30000;
        i = (4 * a(iArr)) / 2;
        f251p = 0;
        f252c = false;
        f253d = false;
        f254e = false;
        int iAbs = Math.abs(k.a.nextInt()) % 100;
        if (iAbs < 15) {
            f252c = true;
            f251p = 1;
        } else if (iAbs < 25) {
            f253d = true;
            f251p = Math.abs(k.a.nextInt()) % 3;
        } else if (iAbs < 45) {
            f254e = true;
        }
        int i7 = 0;
        int i8 = (c * 8) / 2;
        int i9 = i2 / i8;
        int i10 = i2;
        q = 0;
        for (int i11 = 0; i11 < iA; i11++) {
            int iF = f(f257q[i11]);
            int iG = g(f257q[i11]);
            int iMax = Math.max(0, iF * iG * i9);
            int i12 = iMax + ((10 * iMax) / 100) + 1;
            if (i10 > 0 || !f255f || (z2 && !f256g)) {
                if (f254e) {
                    f251p = Math.abs(k.a.nextInt()) % 3;
                }
                a(iArr, i11, iA, i4 + q + 0, iMax, i12, i2, z2);
                if (r > 0) {
                    q += r;
                    i10 -= t;
                }
            }
            int i13 = i8 - (iF * iG);
            i8 = i13;
            if (i13 > 0) {
                i9 = i10 / i8;
            }
        }
        int i14 = 4;
        while (i14 < (3 * f280i[0]) + 4) {
            k.f321c[i7 + q + i4] = k.a(f280i[i14 + 0], 2, 5, 0, 0, f280i[i14 + 1], f280i[i14 + 2]);
            i14 += 3;
            i7++;
        }
        a(i3, i4, i7 + q, q, 0, 3, c, 8, i5, Math.max(0, i2 - i10));
        return i7 + q;
    }

    private static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        k.f319k[i2][0] = 0;
        k.f319k[i2][1] = i4;
        k.f319k[i2][2] = i5;
        k.f319k[i2][3] = ((i6 & 255) << 24) | ((i7 & 255) << 16) | ((i8 & 255) << 8) | (i9 & 255);
        k.f319k[i2][4] = i2 * (k.aJ - k.aI) * k.g;
        k.f319k[i2][5] = i10;
        k.f319k[i2][6] = i11;
        k.f319k[i2][7] = i3;
    }

    private static int a(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i5 <= 2 || i6 <= 2) {
            if (i3 < i7 && i5 > 0 && i6 > 0) {
                i2++;
                f257q[i2] = a(i3, i4, Math.min(i5, i7 - i3), i6);
            }
        } else if (i5 > 8 || i6 > 8 || Math.abs(k.a.nextInt() % 100) <= 50) {
            int iAbs = 2 * (Math.abs(k.a.nextInt()) % (i5 / 2));
            int iAbs2 = 2 * (Math.abs(k.a.nextInt()) % (i6 / 2));
            int i8 = 0;
            while (i8 < 4) {
                i2 = a(i2, i3 + ((i8 == 1 || i8 == 3) ? iAbs : 0), i4 + ((i8 == 2 || i8 == 3) ? iAbs2 : 0), (i8 == 0 || i8 == 2) ? iAbs : i5 - iAbs, (i8 == 0 || i8 == 1) ? iAbs2 : i6 - iAbs2, i7);
                i8++;
            }
        } else if (i3 < i7) {
            i2++;
            f257q[i2] = a(i3, i4, Math.min(i5, i7 - i3), i6);
        }
        return i2;
    }

    private static void b(int i2) {
        int i3 = 0;
        int i4 = i2;
        while (i3 < i2) {
            int iAbs = Math.abs(k.a.nextInt()) % i4;
            int i5 = f257q[i3];
            f257q[i3] = f257q[iAbs];
            f257q[iAbs] = i5;
            i3++;
            i4--;
        }
    }

    private static void a(int[][] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        int i8;
        int iAbs;
        int i9;
        int iD = d(f257q[i2]);
        int iE = e(f257q[i2]);
        int iF = f(f257q[i2]);
        int iG = g(f257q[i2]);
        int iAbs2 = i5 + (Math.abs(k.a.nextInt()) % (i6 - i5));
        int i10 = 0;
        int i11 = 0;
        r = 0;
        s = 0;
        t = 0;
        for (int i12 = 0; i12 < l.length; i12++) {
            l[i12] = 0;
        }
        if (iF < 2 || iG < 2) {
            return;
        }
        for (int i13 = 0; i13 < iG; i13++) {
            for (int i14 = 0; i14 < iF; i14++) {
                i11 += iArr[i13 + iE][i14 + iD];
            }
        }
        if (i11 == 0) {
            return;
        }
        int iMin = Math.min((2 * iAbs2) / i11, 7);
        int i15 = k[2 * iMin];
        int i16 = k[(2 * iMin) + 1];
        int iMin2 = Math.min((100 * iAbs2) / i11, 100);
        boolean z3 = true;
        int i17 = 0;
        int[] iArr2 = null;
        if (iF == 2 && iG == 4) {
            iArr2 = f263b;
        } else if (iF == 4 && iG == 2) {
            iArr2 = f264c;
        } else if (iF == 4 && iG == 4) {
            iArr2 = f265d;
        } else if (iF == 4 && iG == 6) {
            iArr2 = f268g;
        } else if (iF == 6 && iG == 2) {
            iArr2 = f267f;
        } else if (iF == 6 && iG == 6) {
            iArr2 = f266e;
        } else if (iF == 4 && iG == 8) {
            iArr2 = f269h;
        }
        if (DCWall.f19h != 4 && Math.abs(k.a.nextInt()) % 100 <= 40 && iArr2 != null) {
            int i18 = -1;
            int i19 = 1;
            for (int iAbs3 = Math.abs(k.a.nextInt()) % iArr2[0]; iAbs3 > 0; iAbs3--) {
                i19 = iArr2[i19 + 2];
            }
            for (int i20 = 0; i20 < iArr2[0]; i20++) {
                if (DCWall.f19h >= iArr2[i19 + 1]) {
                    int iA = 0;
                    for (int i21 = 0; i21 < iArr2[i19 + 0]; i21++) {
                        int i22 = iArr2[i19 + 3 + i21];
                        iA += a(iArr, k.m88f(i22), k.m89g(i22), iD, iE, k.m92j(i22), k.m93k(i22));
                    }
                    if (iA >= i5 && iA <= i6) {
                        i17 = iA;
                        i18 = i19;
                        break;
                    }
                    i19 = iArr2[i19 + 2];
                }
            }
            if (i18 != -1) {
                new StringBuffer().append("").append(iF).append("x").append(iG).append(" filled with template ").append(i18).toString();
                z3 = false;
                int iAbs4 = Math.abs(k.a.nextInt()) % 3;
                x = Math.abs(k.a.nextInt()) % 3;
                y = Math.abs(k.a.nextInt()) % 3;
                z = Math.abs(k.a.nextInt()) % 3;
                for (int i23 = 0; i23 < iArr2[i18 + 0]; i23++) {
                    int i24 = iArr2[i18 + 3 + i23];
                    int iM88f = k.m88f(i24);
                    int iM92j = k.m92j(i24);
                    int iM93k = k.m93k(i24);
                    int iF2 = k.f(k.m97e(i24, 0 + iD + iM92j), 3 + iE + iM93k);
                    if (iM88f == 3) {
                        i10++;
                    }
                    int iM90h = k.m90h(iF2);
                    if (!f253d && !f254e) {
                        switch (iM90h) {
                            case 0:
                                iM90h = a(iAbs4);
                                break;
                            case 1:
                                iM90h = m62b(iAbs4);
                                break;
                            case 2:
                                iM90h = c(iAbs4);
                                break;
                        }
                    } else {
                        iM90h = f251p;
                    }
                    l[(iF * iM93k) + iM92j] = k.m95c(iF2, iM90h);
                }
            }
        }
        if (z3) {
            for (int i25 = 0; i25 < iG; i25++) {
                for (int i26 = 0; i26 < iF; i26++) {
                    int i27 = iArr[iE + i25][iD + i26];
                    if (i27 == 0) {
                        l[(iF * i25) + i26] = k.a(1, 2, 5, 0, 0, 0 + iD + i26, 3 + iE + i25);
                    } else if (i17 < iAbs2 && i17 + i27 < i6 && Math.abs(k.a.nextInt()) % 100 <= iMin2) {
                        int iAbs5 = Math.abs(k.a.nextInt()) % 100;
                        if (iAbs5 <= i15 || DCWall.f19h == 1) {
                            i8 = 3;
                            iAbs = (f253d || f254e) ? f251p : Math.abs(k.a.nextInt()) % 3;
                            i9 = 1;
                        } else if (iAbs5 <= i16 || DCWall.f19h == 2) {
                            i8 = 4;
                            iAbs = 3;
                            i9 = 2;
                        } else {
                            i8 = 5;
                            iAbs = 4;
                            i9 = 4;
                        }
                        l[(iF * i25) + i26] = k.a(1, i8, iAbs, 0, 0, 0 + iD + i26, 3 + iE + i25);
                        i17 += i9 * i27;
                    }
                }
            }
            int i28 = (((-50) * (i7 - h)) / (i - h)) + 50;
            int i29 = (((-50) * (i7 - h)) / (2 * (i - h))) + 50;
            int i30 = 0;
            int i31 = 1;
            while (i30 < iG) {
                for (int i32 = 0; i32 < iF; i32 += 2) {
                    f258r[0] = l[(iF * i30) + i32];
                    f258r[1] = l[(iF * i30) + i32 + 1];
                    f258r[2] = l[(iF * i31) + i32];
                    f258r[3] = l[(iF * i31) + i32 + 1];
                    if (f258r[0] + f258r[1] + f258r[2] + f258r[3] != 0) {
                        boolean z4 = k.m89g(f258r[0]) == 2 || k.m89g(f258r[1]) == 2;
                        boolean z5 = k.m89g(f258r[2]) == 2 || k.m89g(f258r[3]) == 2;
                        boolean z6 = z4 || z5;
                        if ((!z4 || !z5) && ((!z4 || f258r[2] + f258r[3] != 0) && (!z5 || f258r[0] + f258r[1] != 0))) {
                            int iAbs6 = Math.abs(k.a.nextInt()) % 100;
                            if (iAbs6 <= i28 || (z6 && iAbs6 <= i28 + i29)) {
                                int i33 = 1;
                                int i34 = z4 ? 1 : 0;
                                int iAbs7 = Math.abs(k.a.nextInt()) % 100;
                                if (iAbs7 <= i28 && !z6) {
                                    i33 = 2;
                                } else if ((iAbs7 & 1) == 1) {
                                    i34 = z5 ? 0 : 1;
                                }
                                for (int i35 = 0; i35 < i33; i35++) {
                                    boolean z7 = Math.abs(k.a.nextInt()) % 2 == 1;
                                    int iAbs8 = Math.abs(k.a.nextInt()) % 3;
                                    int iA2 = a(iArr, iD, iE, i32, i30 + i35 + i34, 2, 1, f258r, 2 * i35);
                                    int iB = b(iArr, iD, iE, i32, i30 + i35 + i34, 2, 1);
                                    int iMin3 = iA2 / iB;
                                    switch (DCWall.f19h) {
                                        case 1:
                                            iMin3 = Math.min(iMin3, 1);
                                            break;
                                        case 2:
                                            iMin3 = Math.min(iMin3, 2);
                                            break;
                                        case 3:
                                        case 4:
                                            iMin3 = Math.min(iMin3, 4);
                                            break;
                                    }
                                    switch (iMin3) {
                                        case 1:
                                            b(iD, iE, iF, i32, i30 + i35 + i34, 2, 1, 2, 3, (f253d || f254e) ? f251p : iAbs8);
                                            break;
                                        case 2:
                                            b(iD, iE, iF, i32, i30 + i35 + i34, 2, 1, 2, 4, 3);
                                            break;
                                        case 3:
                                            b(iD, iE, iF, i32, i30 + i35 + i34, 2, 1, 2, z7 ? 4 : 5, z7 ? 3 : 4);
                                            break;
                                        case 4:
                                            b(iD, iE, iF, i32, i30 + i35 + i34, 2, 1, 2, 5, 4);
                                            break;
                                    }
                                    i17 += (iMin3 * iB) - iA2;
                                }
                            } else if (!z6 && iAbs6 <= i28 + i29) {
                                boolean z8 = Math.abs(k.a.nextInt()) % 2 == 1;
                                int iAbs9 = Math.abs(k.a.nextInt()) % 3;
                                int iA3 = a(iArr, iD, iE, i32, i30, 2, 2, f258r, 0);
                                int iB2 = b(iArr, iD, iE, i32, i30, 2, 2);
                                int iMin4 = iA3 / iB2;
                                switch (DCWall.f19h) {
                                    case 1:
                                        iMin4 = Math.min(iMin4, 1);
                                        break;
                                    case 2:
                                        iMin4 = Math.min(iMin4, 2);
                                        break;
                                    case 3:
                                    case 4:
                                        iMin4 = Math.min(iMin4, 4);
                                        break;
                                }
                                switch (iMin4) {
                                    case 1:
                                        b(iD, iE, iF, i32, i30, 2, 2, 3, 3, (f253d || f254e) ? f251p : iAbs9);
                                        break;
                                    case 2:
                                        b(iD, iE, iF, i32, i30, 2, 2, 3, 4, 3);
                                        break;
                                    case 3:
                                        b(iD, iE, iF, i32, i30, 2, 2, 3, z8 ? 4 : 5, z8 ? 3 : 4);
                                        break;
                                    case 4:
                                        b(iD, iE, iF, i32, i30, 2, 2, 3, 5, 4);
                                        break;
                                }
                                i17 += (iMin4 * iB2) - iA3;
                                i10++;
                            }
                        }
                    }
                }
                i30 += 2;
                i31 += 2;
            }
        }
        boolean z9 = z2 && f255f && !f256g;
        boolean z10 = i10 == 0 && !f255f && i2 == i3 - 2;
        boolean z11 = i10 == 0 && z9 && i2 == i3 - 1;
        for (int i36 = 0; i36 < iG; i36++) {
            for (int i37 = 0; i37 < iF; i37++) {
                if (z10 || z11) {
                    for (int i38 = 0; i38 < 2; i38++) {
                        for (int i39 = 0; i39 < 2; i39++) {
                            int i40 = l[(iF * i38) + i39];
                            if (i40 != 0 && k.m89g(i40) != 2) {
                                int[] iArr3 = k.f321c;
                                int i41 = r;
                                r = i41 + 1;
                                iArr3[i4 + i41] = i40;
                            }
                            l[(iF * i38) + i39] = 0;
                        }
                    }
                    int i42 = z10 ? 1 : 6;
                    int i43 = z10 ? 6 : 7;
                    int i44 = ((c + 0) - iD) - 2;
                    int[] iArr4 = k.f321c;
                    int i45 = r;
                    r = i45 + 1;
                    iArr4[i4 + i45] = k.a(3, i42, i43, 0, 0, i44, 3 + iE);
                    f255f = z10 ? true : f255f;
                    f256g = z11 ? true : f256g;
                    z10 = false;
                    z11 = false;
                } else {
                    int i46 = l[(iF * i36) + i37];
                    int iM89g = k.m89g(i46);
                    if (i46 != 0 && iM89g != 2) {
                        int iM88f2 = k.m88f(i46);
                        int iM92j2 = ((c + 0) - k.m92j(i46)) - (iM88f2 == 1 ? 1 : 2);
                        int iM95c = k.m95c(k.m97e(i46, iM92j2), iM89g != 3 ? k.m90h(i46) : (k.m90h(i46) + (f252c ? f251p : 0)) % 3);
                        if ((!f255f || (z9 && !f256g)) && iM88f2 == 3) {
                            int iM95c2 = k.m95c(k.m96d(k.m94b(i46, !f255f ? 1 : 6), 0), !f255f ? 6 : 7);
                            if (Math.abs(k.a.nextInt()) % 2 == 0) {
                                int[] iArr5 = k.f321c;
                                int i47 = r;
                                r = i47 + 1;
                                iArr5[i4 + i47] = iM95c;
                                int[] iArr6 = k.f321c;
                                int i48 = r;
                                r = i48 + 1;
                                iArr6[i4 + i48] = iM95c2;
                            } else {
                                int[] iArr7 = k.f321c;
                                int i49 = r;
                                r = i49 + 1;
                                iArr7[i4 + i49] = k.m97e(iM95c2, iM92j2);
                                int[] iArr8 = k.f321c;
                                int i50 = r;
                                r = i50 + 1;
                                iArr8[i4 + i50] = i46;
                            }
                            if (f255f) {
                                f256g = true;
                            } else {
                                f255f = true;
                            }
                        } else {
                            int[] iArr9 = k.f321c;
                            int i51 = r;
                            r = i51 + 1;
                            iArr9[i4 + i51] = iM95c;
                            int[] iArr10 = k.f321c;
                            int i52 = r;
                            r = i52 + 1;
                            iArr10[i4 + i52] = i46;
                        }
                    }
                }
            }
        }
        t = i17;
    }

    private static void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        for (int i12 = i6; i12 < i6 + i8; i12++) {
            for (int i13 = i5; i13 < i5 + i7; i13++) {
                l[(i4 * i12) + i13] = 0;
            }
        }
        l[(i4 * i6) + i5] = k.a(i9, i10, i11, 0, 0, 0 + i2 + i5, 3 + i3 + i6);
    }

    private static int a(int[][] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            for (int i4 = 0; i4 < c; i4++) {
                i2 += iArr[i3][i4];
            }
        }
        return i2;
    }

    private static int a(int[][] iArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 1;
        int i9 = 1;
        int i10 = 1;
        switch (i2) {
            case 1:
                i8 = 1;
                i9 = 1;
                break;
            case 2:
                i8 = 2;
                i9 = 1;
                break;
            case 3:
                i8 = 2;
                i9 = 2;
                break;
        }
        switch (i3) {
            case 3:
                i10 = 1;
                break;
            case 4:
                i10 = 2;
                break;
            case 5:
                i10 = 4;
                break;
        }
        return i10 * b(iArr, i4, i5, i6, i7, i8, i9);
    }

    private static int a(int[][] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr2, int i8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = i5; i11 < i5 + i7; i11++) {
            int i12 = i4;
            while (i12 < i4 + i6) {
                if (iArr2[i10 + i8] != 0) {
                    i9 += iArr[i11 + i3][i12 + i2];
                }
                i12++;
                i10++;
            }
        }
        return i9;
    }

    private static int b(int[][] iArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 1;
        for (int i9 = i5; i9 < i5 + i7; i9++) {
            for (int i10 = i4; i10 < i4 + i6; i10++) {
                int i11 = iArr[i9 + i3][i10 + i2];
                if (i11 > 0 && (i8 == 1 || i11 < i8)) {
                    i8 = i11;
                }
            }
        }
        return i8;
    }

    private static int a(int i2) {
        int i3 = x;
        boolean z2 = !f270i;
        f270i = z2;
        return a(i3, 0, z2, i2);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static int m62b(int i2) {
        int i3 = y;
        boolean z2 = !j;
        j = z2;
        return a(i3, 1, z2, i2);
    }

    private static int c(int i2) {
        int i3 = z;
        boolean z2 = !f271k;
        f271k = z2;
        return a(i3, 2, z2, i2);
    }

    private static int a(int i2, int i3, boolean z2, int i4) {
        int iAbs = i3;
        switch (i2) {
            case 0:
                iAbs += i4;
                break;
            case 1:
                iAbs += z2 ? i4 : 0;
                break;
            case 2:
                iAbs = Math.abs(k.a.nextInt());
                break;
        }
        return iAbs % 3;
    }

    private static int d(int i2) {
        return (i2 >> 24) & 255;
    }

    private static int e(int i2) {
        return (i2 >> 16) & 255;
    }

    private static int f(int i2) {
        return (i2 >> 8) & 255;
    }

    private static int g(int i2) {
        return (i2 >> 0) & 255;
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return ((i2 & 255) << 24) | ((i3 & 255) << 16) | ((i4 & 255) << 8) | ((i5 & 255) << 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m63a(int i2) {
        if (f282j != null && f272j != 0 && f272j != 5) {
            a(f282j, 11, 660);
        }
        try {
            switch (f272j) {
                case 0:
                    if (!a) {
                        f272j = 1;
                    }
                    break;
                case 1:
                    e();
                    int iH = h(v);
                    int iH2 = h(w);
                    if (iH > -1 && iH < 2 && iH2 > -1 && iH2 < 2) {
                        f272j = 0;
                    } else {
                        int iMin = Math.min(iH, iH2);
                        int iMax = Math.max(iH, iH2);
                        if (iMin == -1) {
                            iMin = iMax;
                            iMax = -1;
                        }
                        if (iMin != 0) {
                            f281l = f283v[1];
                        } else {
                            f281l = f283v[3];
                        }
                        f282j = f279d[f281l];
                        if (iMax == iH) {
                            f259h = true;
                        } else {
                            f259h = false;
                        }
                        i();
                        g();
                        h();
                        A = E;
                        C = A;
                        B = 0;
                        f272j = 2;
                    }
                    break;
                case 2:
                    if (m64a()) {
                        F = 0;
                        G = 0;
                        f272j = 3;
                    }
                    break;
                case 3:
                    if (m65b()) {
                        f272j = 4;
                    }
                    break;
                case 4:
                    f();
                    if (f259h) {
                        v = f281l;
                        m67a(f261b);
                    } else {
                        w = f281l;
                        m67a(f262c);
                    }
                    f272j = 5;
                    break;
                case 5:
                default:
                    break;
            }
        } catch (Exception e2) {
            new StringBuffer().append("GENERATOR ERROR: Exception ").append(e2.toString()).append(" has been thrown").toString();
            f272j = 0;
            if (f259h) {
                v = -1;
            } else {
                w = -1;
            }
        }
        k.aM = i2;
        k.m78c(i2);
    }

    private static int h(int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < f283v.length; i4 += 2) {
            if (i2 == f283v[i4 + 1]) {
                i3 = i4 / 2;
            }
        }
        return i3;
    }

    private static void e() {
        int i2 = 0;
        int i3 = 1;
        while (i2 < f283v.length) {
            f283v[i2 + 0] = Math.abs(((f279d[i3][2] + f279d[i3][1]) / 2) - d);
            f283v[i2 + 1] = i3;
            i2 += 2;
            i3++;
        }
        a(f283v);
    }

    private static void a(int[] iArr) {
        for (int length = iArr.length - 2; length >= 0; length -= 2) {
            for (int i2 = 2; i2 <= length; i2 += 2) {
                if (iArr[(i2 - 2) + 0] > iArr[i2 + 0]) {
                    int i3 = iArr[(i2 - 2) + 0];
                    int i4 = iArr[(i2 - 2) + 1];
                    iArr[(i2 - 2) + 0] = iArr[i2 + 0];
                    iArr[(i2 - 2) + 1] = iArr[i2 + 1];
                    iArr[i2 + 0] = i3;
                    iArr[i2 + 1] = i4;
                }
            }
        }
    }

    private static void a(int[] iArr, int i2, int i3) {
        int i4 = 4;
        int i5 = 0;
        while (i4 < (3 * iArr[0]) + 4) {
            k.f321c[i5 + i3] = k.a(iArr[i4 + 0], 2, 5, 0, 0, iArr[i4 + 1], iArr[i4 + 2]);
            i4 += 3;
            i5++;
        }
        a(i2, i3, iArr[0], 0, 0, 0, k.aH, k.aI, 0, 0);
        k.aM = i2;
        k.m78c(i2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m64a() {
        boolean z2 = false;
        int i2 = C;
        if (B == 2) {
            z2 = true;
        } else if (i2 == f273k) {
            D = E;
            int i3 = A;
            C = i3;
            E = i3;
            B++;
        } else {
            int i4 = 0;
            int i5 = 0;
            int iA = a(f276t[i2], true);
            int iB = b(f276t[i2], true);
            int iA2 = a(f276t[i2], false);
            int iB2 = b(f276t[i2], false);
            if (i(f276t[i2]) == 0) {
                for (int i6 = D; i6 < E; i6++) {
                    if (i(f276t[i6]) == 0 && m66c()) {
                        int iA3 = a(f276t[i6], true);
                        int iB3 = b(f276t[i6], true);
                        if (a(f277u[n(f276t[i6])], a(iA3, a(f276t[i6], false), iA), a(iB3, b(f276t[i6], false), iB), iA, iB, iA2, iB2)) {
                            i4 += H;
                            i5++;
                        }
                    }
                }
                if (i4 > 0) {
                    f277u[n(f276t[i2])] = i4 / (90 * i5);
                    if (A != i2) {
                        int i7 = f276t[A];
                        f276t[A] = f276t[i2];
                        f276t[i2] = i7;
                    }
                    A++;
                }
            }
            C++;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m65b() {
        boolean z2 = false;
        int i2 = F;
        int i3 = G;
        if (i2 == 8) {
            z2 = true;
        } else if (i3 == c) {
            F++;
            G = 0;
        } else {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = i3 + 0;
            int i8 = i2 + 3;
            if (k.m82e(k.m80a(i7, i8)) != 0) {
                f278e[i2][i3] = 0;
            } else {
                f274s[0] = f * i7;
                f274s[1] = g * i8;
                f274s[2] = f * i7;
                f274s[3] = (g * i8) + g;
                f274s[4] = (f * i7) + f;
                f274s[5] = (g * i8) + g;
                f274s[6] = (f * i7) + f;
                f274s[7] = g * i8;
                for (int i9 = 0; i9 < f273k; i9++) {
                    if (i(f276t[i9]) == 0) {
                        int iL = l(f276t[i9]);
                        int iM = m(f276t[i9]);
                        int i10 = k(f276t[i9]) == 4 ? -1 : 0;
                        int i11 = k(f276t[i9]) == 7 ? -1 : 0;
                        if (i7 != iL || i8 != iM) {
                            char c2 = i7 < iL + i10 ? (char) 2 : i7 == iL + i10 ? (char) 1 : (char) 0;
                            char c3 = i8 < iM + i11 ? (char) 2 : i8 == iM + i11 ? (char) 1 : (char) 0;
                            int i12 = f274s[f275a[c3][c2][0]];
                            int i13 = f274s[f275a[c3][c2][0] + 1];
                            if (a(f277u[n(f276t[i9])], a(a(f276t[i9], true), a(f276t[i9], false), i12), a(b(f276t[i9], true), b(f276t[i9], false), i13), i12, i13, f274s[f275a[c3][c2][1]], f274s[f275a[c3][c2][1] + 1])) {
                                i4 += H;
                                i5 += I;
                                i6++;
                            }
                        }
                    }
                }
            }
            if (i6 != 0) {
                f278e[i2][i3] = (i4 / i6) & 65535;
                int[] iArr = f278e[i2];
                iArr[i3] = iArr[i3] | (((i5 / i6) << 16) & (-65536));
            } else {
                f278e[i2][i3] = 0;
            }
            G++;
        }
        return z2;
    }

    private static boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z2 = false;
        int i9 = i5;
        int i10 = i6;
        int i11 = i7;
        int i12 = i8;
        H = 0;
        for (int i13 = 256; i13 <= 512; i13 += 256) {
            int i14 = k.f319k[k.aM][4];
            boolean zA = k.a((int[]) null, i3, i4 + i14, i9, i10 + i14, false);
            boolean zA2 = k.a((int[]) null, i3, i4 + i14, i11, i12 + i14, false);
            if (!zA && !zA2) {
                int iB = b(i3, i4, i9, i10);
                int iB2 = b(i3, i4, i11, i12);
                H = (i2 * Math.abs(iB2 - iB)) >> 10;
                I = (iB + iB2) / 2;
                z2 = true;
                break;
            }
            if (zA) {
                i9 = (((1024 - i13) * i5) + (i13 * i7)) >> 10;
                i10 = (((1024 - i13) * i6) + (i13 * i8)) >> 10;
            }
            if (zA2) {
                i11 = (((1024 - i13) * i7) + (i13 * i5)) >> 10;
                i12 = (((1024 - i13) * i8) + (i13 * i6)) >> 10;
            }
        }
        return z2;
    }

    private static int a(int i2, int i3, int i4) {
        return i2 < i4 ? i2 : i3;
    }

    private static int a(int i2, boolean z2) {
        int i3 = 0;
        int iK = k(i2);
        int iL = l(i2);
        switch (iK) {
            case 0:
            case 2:
                i3 = (iL * f) + (z2 ? 0 : f - 1);
                break;
            case 1:
            case 5:
            case 7:
                i3 = iL * f;
                break;
            case 3:
                i3 = (iL + 1) * f;
                break;
            case 4:
                i3 = (iL * f) + (z2 ? (-f) + 1 : 0);
                break;
            case 6:
                i3 = (iL * f) + (z2 ? 0 : f - 1);
                break;
        }
        return i3 + f248m[iK] + f250o[j(i2)];
    }

    private static int b(int i2, boolean z2) {
        int i3 = 0;
        int iK = k(i2);
        int iM = m(i2);
        switch (iK) {
            case 0:
            case 4:
            case 6:
                i3 = iM * g;
                break;
            case 1:
            case 3:
                i3 = (iM * g) + (z2 ? 0 : g - 1);
                break;
            case 2:
                i3 = (iM + 1) * g;
                break;
            case 5:
                i3 = (iM * g) + (z2 ? 0 : g - 1);
                break;
            case 7:
                i3 = (iM * g) + (z2 ? (-g) + 1 : 0);
                break;
        }
        return i3 + f249n[iK] + p[j(i2)];
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static boolean m66c() {
        return true;
    }

    private static int b(int i2, int i3, int i4, int i5) {
        int i6;
        int iAbs = Math.abs(i4 - i2);
        int iAbs2 = Math.abs(i5 - i3);
        if (iAbs > iAbs2) {
            i6 = f247a[(iAbs2 * 256) / iAbs];
        } else {
            i6 = iAbs2 > iAbs ? 92160 - f247a[(iAbs * 256) / iAbs2] : 46080;
        }
        return i6;
    }

    private static int i(int i2) {
        return (i2 >> 27) & 31;
    }

    private static int j(int i2) {
        return (i2 >> 24) & 7;
    }

    private static int k(int i2) {
        return (i2 >> 20) & 15;
    }

    private static int l(int i2) {
        return (i2 >> 15) & 31;
    }

    private static int m(int i2) {
        return (i2 >> 10) & 31;
    }

    private static int n(int i2) {
        return (i2 >> 0) & 1023;
    }

    private static int b(int i2, int i3, int i4, int i5, int i6, int i7) {
        return ((i2 & 31) << 27) | ((i3 & 7) << 24) | ((i4 & 15) << 20) | ((i5 & 31) << 15) | ((i6 & 31) << 10) | ((i7 & 1023) << 0);
    }

    private static void f() {
        for (int i2 = 0; i2 < 8; i2++) {
            for (int i3 = 0; i3 < c; i3++) {
                if (f278e[i2][i3] != 0) {
                    int i4 = f278e[i2][i3] & 65535;
                    int i5 = (f278e[i2][i3] >> 16) & 65535;
                    f278e[i2][i3] = ((164160 - 20160) * (((((k.R / k.e) * k.m101m((256 * i5) / 368640)) >> 16) * 1024) / (1024 - ((512 * (((k.R / k.e) * k.m100l((256 * i5) / 368640)) >> 16)) / (f246b - ((3 + i2) + 1)))))) / i4;
                }
            }
        }
    }

    private static void g() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        while (i6 < e) {
            if (i6 < f245a) {
                i2 = i6 != 0 ? 4 : 1;
                i3 = 6;
                i4 = i6;
                i5 = f246b;
            } else if (i6 < f245a + f246b) {
                i2 = i6 != f245a ? 4 : 2;
                i3 = 7;
                i4 = f245a;
                i5 = (f245a + f246b) - i6;
            } else if (i6 < (2 * f245a) + f246b) {
                i2 = i6 != f245a + f246b ? 4 : 3;
                i3 = 4;
                i4 = ((2 * f245a) + f246b) - i6;
                i5 = 0;
            } else {
                i2 = i6 != (2 * f245a) + f246b ? 4 : 0;
                i3 = 5;
                i4 = 0;
                i5 = i6 - ((2 * f245a) + f246b);
            }
            f276t[i6] = b(0, i2, i3, i4, i5, i6);
            i6++;
        }
        int i7 = e;
        int i8 = 0;
        while (i7 < (4 * f282j[0]) + e) {
            f276t[i7] = b(0, 4, i8 % 4, f282j[(3 * (i8 / 4)) + 1 + 4], f282j[(3 * (i8 / 4)) + 2 + 4], i7);
            i7++;
            i8++;
        }
        f273k = (4 * f282j[0]) + e;
        D = 0;
        E = f245a;
    }

    private static void h() {
        int i2 = 0;
        while (i2 < f273k) {
            f277u[i2] = i2 < f245a ? 1024 : 1;
            i2++;
        }
    }

    private static void i() {
        for (int i2 = 0; i2 < 8; i2++) {
            for (int i3 = 0; i3 < c; i3++) {
                f278e[i2][i3] = 0;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static void m67a(int[][] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            for (int i3 = 0; i3 < c; i3++) {
                iArr[i2][i3] = f278e[i2][i3];
            }
        }
    }
}

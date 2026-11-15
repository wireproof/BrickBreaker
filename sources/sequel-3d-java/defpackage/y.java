package defpackage;

/* JADX INFO: loaded from: sequel-3d-java.jar:y.class */
public final class y {

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private boolean f330e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private boolean f331f;
    private int m;
    private int n;
    private int o;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private boolean f344g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private boolean f345h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private boolean f346i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static y f349a;
    private boolean a = true;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f324a = 30000;
    private int b = 0;
    private int c = 0;
    private int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int[] f325a = {100, 100, 100, 100, 50, 100, 20, 90, 10, 70, 0, 50, 0, 30, 0, 0};
    private int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f327b = false;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f328c = false;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private boolean f329d = false;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 1;
    private int l = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int[][] f334a = {new int[]{1925, 1931, 1927, 1927, 1927, 1921, 1914, 1914, 1910, 1904, 1898, 1896, 1890, 1883, 1883, 1877, 1870, 1862, 1858, 1853}, new int[]{1896, 1892, 1901, 1907, 1916, 1916, 1918, 1923, 1925, 1932, 1932, 1934, 1942, 1945, 1951, 1953, 1955, 1955, 1955, 1957}, new int[]{1819, 1814, 1817, 1822, 1826, 1824, 1827, 1821, 1819, 1821, 1821, 1824, 1824, 1827, 1826, 1827, 1827, 1822, 1819, 1817}, new int[]{1838, 1828, 1833, 1835, 1835, 1835, 1833, 1827, 1828, 1832, 1832, 1828, 1832, 1835, 1836, 1839, 1841, 1838, 1833, 1835}, new int[]{1864, 1858, 1853, 1853, 1852, 1846, 1838, 1834, 1828, 1822, 1819, 1819, 1819, 1818, 1821, 1821, 1817, 1814, 1812, 1815}, new int[]{1814, 1903, 1901, 1900, 1896, 1896, 1891, 1891, 1887, 1889, 1893, 1894, 1904, 1911, 1921, 1928, 1938, 1947, 1954, 1851}, new int[]{1915, 1892, 1883, 1876, 1867, 1853, 1844, 1842, 1836, 1837, 1835, 1833, 1842, 1844, 1853, 1863, 1873, 1881, 1890, 1901}, new int[]{2156, 2124, 2112, 2093, 2076, 2062, 2049, 2040, 2034, 2026, 2028, 2034, 2039, 2048, 2060, 2076, 2093, 2108, 2121, 2136}};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final int[][] f335b = {new int[]{2151, 1908, 1992, 2065, 2140, 2204, 2153, 1910, 1822, 0, 0, 1780, 1909, 2153, 2204, 2147, 2072, 1996, 1914, 2147}, new int[]{1800, 2131, 1890, 1974, 2019, 2062, 2115, 2104, 2075, 15692, 14485, 2149, 2143, 2125, 2051, 1987, 1934, 1846, 2073, 1752}, new int[]{1758, 1694, 1722, 1777, 1858, 1821, 1902, 1941, 1908, 0, 0, 1850, 1930, 1897, 1837, 1882, 1813, 1763, 1741, 1796}, new int[]{1674, 1662, 1606, 1646, 1713, 1717, 1849, 2000, 2086, 9323, 9257, 2086, 2001, 1858, 1720, 1711, 1643, 1604, 1661, 1664}, new int[]{1907, 1784, 1748, 1684, 1661, 1697, 1848, 1939, 2142, 0, 0, 2147, 1936, 1848, 1701, 1665, 1687, 1744, 1780, 1893}, new int[]{2092, 2032, 1951, 1900, 1852, 1746, 1783, 2011, 2436, 7955, 7912, 2560, 2006, 1779, 1739, 1843, 1891, 1939, 2017, 2064}, new int[]{2748, 2608, 2533, 2467, 2357, 2255, 2163, 2772, 3842, 0, 0, 3787, 2778, 2172, 2268, 2376, 2497, 2570, 2651, 2773}, new int[]{6498, 6240, 6016, 5812, 5602, 5346, 5167, 5010, 4936, 1395, 1395, 4936, 5012, 5165, 5338, 5590, 5794, 5995, 6210, 6425}};

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private final int[] f337c = {6, 4, 1, 8, 564133920, 564133921, 563085314, 563085315, 4, 1, 15, 564133888, 564133889, 564133922, 564133923, 4, 1, 22, 564133920, 564133889, 564133922, 564133891, 4, 1, 29, 563085312, 563085345, 563085314, 563085347, 3, 1, 35, 1099956224, 564133922, 564133891, 2, 1, 1, 1099956225, 1099956227};

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private final int[] f338d = {4, 2, 1, 6, 1101004800, 1101004865, 2, 1, 11, 1101004864, 1101004801, 4, 1, 18, 563085312, 563085376, 563085345, 563085409, 2, 1, 1, 1101004801, 1101004865};

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private final int[] f339e = {11, 4, 1, 8, 563085312, 563085408, 563085315, 563085411, 4, 1, 15, 563085313, 564133953, 563085346, 564133986, 5, 1, 23, 563085312, 563085408, 1637875745, 563085315, 563085411, 4, 1, 30, 1637875712, 1636827200, 1637875714, 1636827202, 2, 1, 35, 1636827200, 1636827138, 2, 1, 40, 1637875712, 1637875778, 4, 1, 47, 1099956288, 1099956225, 1099956290, 1099956227, 4, 1, 54, 1101004800, 1101004865, 1101004802, 1101004867, 4, 1, 61, 1101004800, 1101004864, 1101004802, 1101004866, 4, 1, 68, 1101004800, 564133984, 564133891, 1101004867, 4, 1, 1, 564133888, 1101004864, 1101004803, 564133987};

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private final int[] f340f = {26, 4, 1, 8, 1637875776, 1637875714, 1637875842, 1637875780, 5, 1, 16, 1637875712, 1637875840, 1637875778, 1637875716, 1637875844, 7, 1, 26, 1099956288, 1099956225, 1099956353, 1637875778, 1099956228, 1099956356, 1099956293, 7, 1, 36, 1636827200, 1099956225, 1099956353, 1101004804, 1101004932, 564133893, 564134053, 16, 1, 55, 1101004800, 1101004864, 1101004928, 564133889, 564134049, 564133890, 564134050, 564133891, 564133955, 564134051, 564133892, 564133956, 564134052, 1101004805, 564133957, 564134053, 10, 1, 68, 1101004832, 1101004896, 564133921, 564134017, 1099956227, 1099956355, 563085348, 563085444, 563085349, 563085445, 8, 1, 79, 1101004800, 1101004864, 1637875840, 564133889, 564133890, 564133891, 1637875716, 1101004933, 18, 1, 100, 564133889, 564133921, 564133953, 564133985, 564134017, 564134049, 564133891, 564133923, 564133955, 564133987, 564134019, 564134051, 563085317, 563085349, 563085381, 563085413, 563085445, 563085477, 12, 1, 115, 564133888, 563085408, 564133921, 563085441, 564133954, 563085474, 563085315, 564133987, 563085348, 564134020, 563085381, 564134053, 8, 2, 126, 1110443008, 1110443072, 1637875840, 573572097, 573572098, 573572099, 1637875716, 1101004933, 18, 2, 147, 573572128, 573572192, 573572256, 573572129, 573572193, 573572257, 573572130, 573572194, 573572258, 573572131, 573572195, 573572259, 573572132, 573572196, 573572260, 573572133, 573572197, 573572261, 18, 2, 168, 564133920, 573572192, 564134048, 573572129, 564133985, 573572257, 564133922, 573572194, 564134050, 573572131, 564133987, 573572259, 564133924, 573572196, 564134052, 573572133, 564133989, 573572261, 12, 2, 183, 573572160, 564134048, 573572129, 564134017, 573572098, 564133986, 564133955, 573572259, 564133924, 573572228, 564133893, 573572197, 7, 2, 193, 1110443072, 1110443009, 1110443137, 1637875778, 1110443012, 1110443140, 1110443077, 8, 2, 204, 1110443008, 1110443136, 1101004865, 1647313922, 1647314050, 1101004868, 1110443013, 1110443141, 16, 2, 223, 1110443008, 1110443072, 1110443136, 573572097, 573572257, 573572098, 573572258, 573572099, 573572163, 573572259, 573572100, 573572164, 573572260, 1110443013, 573572165, 573572261, 10, 3, 236, 1119882272, 1119882336, 573572129, 573572225, 1119882243, 1119882371, 573572132, 573572228, 573572133, 573572229, 8, 3, 247, 1119882240, 1119882304, 1656753280, 583011329, 583011330, 583011331, 1656753156, 1119882373, 8, 3, 258, 1110443008, 1110443072, 1656753280, 573572097, 573572098, 573572099, 1656753156, 1110443141, 18, 3, 279, 564133889, 564133921, 564133953, 564133985, 564134017, 564134049, 564133891, 573572131, 564133955, 573572195, 564134019, 573572259, 583011333, 564133925, 583011397, 564133989, 583011461, 564134053, 18, 3, 300, 573572096, 573572128, 573572160, 573572192, 573572224, 573572256, 583011330, 583011362, 583011394, 583011426, 583011458, 583011490, 573572100, 573572132, 573572164, 573572196, 573572228, 573572260, 18, 3, 321, 583011329, 583011361, 583011393, 583011425, 583011457, 583011489, 573572099, 573572131, 573572163, 573572195, 573572227, 573572259, 583011333, 583011365, 583011397, 583011429, 583011461, 583011493, 18, 3, 342, 583011328, 583011392, 583011456, 583011329, 583011393, 583011457, 583011330, 583011394, 583011458, 583011331, 583011395, 583011459, 583011332, 583011396, 583011460, 583011333, 583011397, 583011461, 12, 3, 357, 573572096, 583011424, 573572129, 583011457, 573572162, 583011490, 583011331, 573572195, 583011364, 573572228, 583011397, 573572261, 7, 3, 367, 1110443072, 1110443009, 1110443137, 1656753218, 1110443012, 1110443140, 1110443077, 16, 3, 1, 1119882240, 1119882304, 1119882368, 583011329, 583011489, 583011330, 583011490, 583011331, 583011395, 583011491, 583011332, 583011396, 583011492, 1119882245, 583011397, 583011493};

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private final int[] f341g = {4, 2, 1, 6, 1637875712, 1637875840, 6, 1, 15, 563085344, 563085408, 563085472, 563085313, 563085377, 563085441, 3, 1, 21, 1099956288, 1099956225, 1099956353, 3, 1, 1, 1099956224, 1099956352, 1099956289};

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private final int[] f342h = {19, 12, 1, 16, 564133888, 564133984, 564133889, 564133985, 564133890, 564133986, 564133891, 564133987, 564133892, 564133988, 564133893, 564133989, 6, 1, 25, 1101004800, 1101004801, 1101004802, 1101004803, 1101004804, 1101004805, 6, 1, 34, 1101004800, 1101004801, 1101004865, 1101004804, 1101004868, 1101004805, 6, 1, 43, 1101004864, 1101004801, 1101004865, 1101004804, 1101004868, 1101004869, 6, 1, 52, 1101004864, 1101004865, 1101004866, 1101004867, 1101004868, 1101004869, 3, 1, 58, 1637875712, 1637875714, 1637875716, 3, 1, 64, 1637875776, 1637875778, 1637875780, 12, 2, 79, 564133888, 573572192, 573572097, 564133985, 564133890, 573572194, 573572099, 564133987, 564133892, 573572196, 573572101, 564133989, 6, 2, 88, 1101004800, 1101004801, 1110443010, 1110443011, 1101004804, 1101004805, 6, 2, 97, 1101004864, 1101004865, 1110443074, 1110443075, 1101004868, 1101004869, 6, 2, 106, 1101004800, 1110443009, 1110443073, 1110443012, 1110443076, 1101004805, 6, 2, 115, 1101004864, 1110443009, 1110443073, 1110443012, 1110443076, 1101004869, 3, 2, 121, 1647313920, 1637875714, 1647313924, 3, 2, 127, 1647313984, 1637875778, 1647313988, 12, 3, 142, 564133888, 583011424, 583011329, 564133985, 564133890, 583011426, 583011331, 564133987, 564133892, 583011428, 583011333, 564133989, 6, 3, 151, 1101004800, 1110443009, 1119882242, 1119882243, 1110443012, 1101004805, 6, 3, 160, 1101004864, 1110443073, 1119882306, 1119882307, 1110443076, 1101004869, 3, 3, 166, 1656753152, 1637875714, 1656753156, 3, 3, 1, 1656753216, 1637875778, 1656753220};

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private final int[] f343i = {19, 16, 1, 20, 564133888, 564133984, 564133889, 564133985, 564133890, 564133986, 564133891, 564133987, 564133892, 564133988, 564133893, 564133989, 564133894, 564133990, 564133895, 564133991, 8, 1, 31, 1101004800, 1101004801, 1101004802, 1101004803, 1101004804, 1101004805, 1101004806, 1101004807, 8, 1, 42, 1101004800, 1101004801, 1101004802, 1101004866, 1101004805, 1101004869, 1101004806, 1101004807, 8, 1, 53, 1101004864, 1101004865, 1101004802, 1101004866, 1101004805, 1101004869, 1101004870, 1101004871, 8, 1, 64, 1101004864, 1101004865, 1101004866, 1101004867, 1101004868, 1101004869, 1101004870, 1101004871, 4, 1, 71, 1637875712, 1637875714, 1637875716, 1637875718, 4, 1, 78, 1637875776, 1637875778, 1637875780, 1637875782, 16, 2, 97, 564133888, 573572192, 573572097, 564133985, 564133890, 573572194, 573572099, 564133987, 564133892, 573572196, 573572101, 564133989, 564133894, 573572198, 573572103, 564133991, 8, 2, 108, 1101004800, 1101004801, 1101004802, 1110443011, 1110443012, 1101004805, 1101004806, 1101004807, 8, 2, 119, 1101004864, 1101004865, 1101004866, 1110443075, 1110443076, 1101004869, 1101004870, 1101004871, 8, 2, 130, 1101004800, 1101004801, 1110443010, 1110443074, 1110443013, 1110443077, 1101004806, 1101004807, 8, 2, 141, 1101004864, 1101004865, 1110443010, 1110443074, 1110443013, 1110443077, 1101004870, 1101004871, 4, 2, 148, 1647313920, 1637875714, 1637875716, 1647313926, 4, 2, 155, 1647313984, 1637875778, 1637875780, 1647313990, 16, 3, 174, 564133888, 583011424, 583011329, 564133985, 564133890, 583011426, 583011331, 564133987, 564133892, 583011428, 583011333, 564133989, 564133894, 583011430, 583011335, 564133991, 8, 3, 185, 1101004800, 1101004801, 1110443010, 1119882243, 1119882244, 1110443013, 1101004806, 1101004807, 8, 3, 196, 1101004864, 1101004865, 1110443074, 1119882307, 1119882308, 1110443077, 1101004870, 1101004871, 4, 3, 203, 1656753152, 1637875714, 1637875716, 1656753158, 4, 3, 1, 1656753216, 1637875778, 1637875780, 1656753222};

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private int[][] f347d = {new int[]{0, 20000, 60000, 0}, new int[]{4, 30000, 80000, 0, 2, 9, 3, 2, 9, 5, 2, 9, 7, 2, 9, 9}, new int[]{8, 40000, 90000, 0, 1, 2, 6, 1, 7, 6, 1, 12, 6, 1, 17, 6, 1, 2, 7, 1, 7, 7, 1, 12, 7, 1, 17, 7}, new int[]{3, 50000, 110000, 0, 3, 7, 6, 3, 9, 6, 3, 11, 6}, new int[]{4, 60000, 120000, 0, 2, 9, 4, 3, 6, 6, 3, 12, 6, 2, 9, 9}, new int[]{10, 80000, 150000, 0, 2, 6, 4, 2, 12, 4, 2, 9, 5, 1, 2, 6, 1, 17, 6, 2, 9, 7, 1, 2, 7, 1, 17, 7, 2, 6, 9, 2, 12, 9}, new int[]{9, 100000, 200000, 0, 2, 5, 4, 2, 13, 4, 2, 7, 5, 2, 11, 5, 3, 9, 6, 2, 7, 8, 2, 11, 8, 2, 5, 9, 2, 13, 9}, new int[]{6, 150000, 300000, 0, 2, 2, 9, 2, 4, 9, 2, 8, 9, 2, 10, 9, 2, 14, 9, 2, 16, 9}};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Object[][] f326a = new Object[64][];

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private int[] f348j = this.f347d[0];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f332b = new int[32];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Object[][] f333b = new Object[4][];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private final int[][] f336c = new int[8][20];

    private y() {
        int[] iArr = {0, 229, 458, 687, 916, 1145, 1374, 1603, 1832, 2061, 2290, 2519, 2748, 2976, 3205, 3433, 3662, 3890, 4118, 4346, 4574, 4802, 5029, 5257, 5484, 5711, 5938, 6165, 6391, 6618, 6844, 7070, 7296, 7521, 7746, 7971, 8196, 8421, 8645, 8869, 9093, 9317, 9540, 9763, 9986, 10208, 10431, 10652, 10874, 11095, 11316, 11537, 11757, 11977, 12197, 12416, 12635, 12853, 13071, 13289, 13507, 13724, 13940, 14157, 14373, 14588, 14803, 15018, 15232, 15446, 15660, 15873, 16085, 16297, 16509, 16720, 16931, 17142, 17352, 17561, 17770, 17979, 18187, 18394, 18601, 18808, 19014, 19220, 19425, 19630, 19834, 20038, 20241, 20444, 20646, 20848, 21049, 21250, 21450, 21649, 21848, 22047, 22245, 22443, 22640, 22836, 23032, 23227, 23422, 23616, 23810, 24003, 24196, 24388, 24580, 24771, 24961, 25151, 25340, 25529, 25717, 25905, 26092, 26278, 26464, 26649, 26834, 27018, 27202, 27385, 27568, 27750, 27931, 28112, 28292, 28471, 28650, 28829, 29007, 29184, 29361, 29537, 29712, 29887, 30062, 30236, 30409, 30582, 30754, 30925, 31096, 31266, 31436, 31605, 31774, 31942, 32109, 32276, 32442, 32608, 32773, 32938, 33101, 33265, 33428, 33590, 33751, 33913, 34073, 34233, 34392, 34551, 34709, 34867, 35024, 35180, 35336, 35492, 35646, 35801, 35954, 36107, 36260, 36412, 36563, 36714, 36864, 37014, 37163, 37312, 37460, 37607, 37754, 37901, 38047, 38192, 38337, 38481, 38624, 38768, 38910, 39052, 39194, 39335, 39475, 39615, 39754, 39893, 40032, 40169, 40307, 40443, 40580, 40715, 40850, 40985, 41119, 41253, 41386, 41519, 41651, 41782, 41913, 42044, 42174, 42303, 42432, 42561, 42689, 42817, 42944, 43070, 43196, 43322, 43447, 43572, 43696, 43819, 43943, 44065, 44188, 44309, 44431, 44551, 44672, 44792, 44911, 45030, 45148, 45266, 45384, 45501, 45618, 45734, 45849, 45965};
        int[] iArr2 = {0, -1, 0, 1, 0, 1, 0, -1};
        int[] iArr3 = {-1, 0, 1, 0, 1, 0, -1, 0};
        int[] iArr4 = {0, 1, 0, -1, 0};
        int[] iArr5 = {1, 0, -1, 0, 0};
        int[][][] iArr6 = {new int[][]{new int[]{2, 6}, new int[]{0, 6}, new int[]{0, 4}}, new int[][]{new int[]{0, 2}, new int[]{0, 0}, new int[]{6, 4}}, new int[][]{new int[]{0, 4}, new int[]{2, 4}, new int[]{2, 6}}};
    }

    public static y a() {
        return f349a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m118a() {
        f349a = new y();
    }

    public final void b() {
        this.c = 0;
        this.d = 1;
    }

    public final void c() {
        this.d++;
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        int[][] iArr;
        if (i == 0) {
            iArr = this.f334a;
        } else if (i == 1) {
            iArr = this.f335b;
        } else if (i != 2) {
            return;
        } else {
            iArr = this.f336c;
        }
        this.c += a(iArr, i2, i3, 0, 0, i4, i5 - 3);
    }

    public final void d() {
        int i = 0;
        int i2 = 0;
        this.b++;
        switch (z.n) {
            case 1:
            case 2:
            case 3:
            case 4:
                i = (50 * this.f324a) / 100;
                i2 = (150 * this.f324a) / 100;
                break;
        }
        new StringBuffer().append("threshold min ").append(i).toString();
        new StringBuffer().append("threshold max ").append(i2).toString();
        int i3 = this.c / this.d;
        new StringBuffer().append("old performance was ").append(this.f324a).append(" and the current performance was ").append(i3).toString();
        if (i3 <= i) {
            i3 = i;
        } else if (i3 >= i2) {
            i3 = i2;
        }
        this.f324a = ((this.f324a * this.b) + i3) / (this.b + 1);
        this.f324a = Math.max(30000, Math.min(3000000, this.f324a));
        new StringBuffer().append("new performance is ").append(this.f324a).toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m119a() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        switch (z.n) {
            case 1:
                i = 30000;
                i2 = 60000;
                i3 = 30000;
                i4 = 45000;
                break;
            case 2:
                i = 40000;
                i2 = 80000;
                i3 = 40000;
                i4 = 60000;
                break;
            case 3:
                i = 50000;
                i2 = 100000;
                i3 = 50000;
                i4 = 100000;
                break;
            case 4:
                i = 80000;
                i2 = 320000;
                i3 = 80000;
                i4 = 3000000;
                break;
        }
        int iMax = Math.max(i3, Math.min(i4, (((i4 - i3) * (this.f324a - i)) / (i2 - i)) + i3));
        new StringBuffer().append("getDifficulty() == ").append(iMax).toString();
        return iMax;
    }

    public final int a(int i, int i2, int i3, boolean z) {
        if (this.a) {
            this.a = false;
        }
        return b(i3, i, i2, z);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:143:0x0572  */
    /* JADX WARN: Code duplicated, block: B:145:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:150:0x05d0  */
    public final int b(int i, int i2, int i3, boolean z) {
        int i4;
        int iAbs;
        int i5;
        int i6;
        int iB;
        int iD;
        int[][] iArr = null;
        this.f330e = false;
        this.f331f = false;
        int iA = a(0, 0, 0, 10, 8, 10);
        int i7 = 0;
        int i8 = iA;
        while (i7 < iA) {
            int iAbs2 = Math.abs(z.f362a.nextInt()) % i8;
            int i9 = this.f332b[i7];
            this.f332b[i7] = this.f332b[iAbs2];
            this.f332b[iAbs2] = i9;
            i7++;
            i8--;
        }
        int i10 = 0;
        int i11 = -1;
        if (z.n == 4) {
            while (i11 == -1) {
                switch (Math.abs(z.f362a.nextInt()) % 3) {
                    case 0:
                        i10 = 0;
                        i11 = 0;
                        iArr = this.f334a;
                        break;
                    case 1:
                        i10 = 1;
                        i11 = this.k;
                        iArr = this.f335b;
                        break;
                    case 2:
                        i10 = 2;
                        i11 = this.l;
                        iArr = this.f336c;
                        break;
                }
            }
            this.f348j = this.f347d[i11];
        } else {
            this.f348j = this.f347d[0];
            iArr = this.f334a;
        }
        this.f = 30000;
        int[][] iArr2 = iArr;
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            for (int i14 = 0; i14 < 20; i14++) {
                i12 += iArr2[i13][i14];
            }
        }
        this.g = (4 * i12) / 2;
        this.e = 0;
        this.f327b = false;
        this.f328c = false;
        this.f329d = false;
        int iAbs3 = Math.abs(z.f362a.nextInt()) % 100;
        if (iAbs3 < 15) {
            this.f327b = true;
            this.e = 1;
        } else if (iAbs3 < 25) {
            this.f328c = true;
            this.e = Math.abs(z.f362a.nextInt()) % 4;
        } else if (iAbs3 < 45) {
            this.f329d = true;
        }
        int i15 = 0;
        int i16 = 80;
        int i17 = i / 80;
        int i18 = i;
        this.h = 0;
        for (int i19 = 0; i19 < iA; i19++) {
            int iA2 = a(this.f332b[i19]);
            int i20 = this.f332b[i19] & 255;
            int iMax = Math.max(0, iA2 * i20 * i17);
            int i21 = iMax + ((iMax * 10) / 100) + 1;
            if ((i18 > 0 && !(this.h >= z.f471d[z.n - 1])) || !this.f330e || (z && !this.f331f)) {
                if (this.f329d) {
                    this.e = Math.abs(z.f362a.nextInt()) % 4;
                }
                int[][] iArr3 = iArr;
                int i22 = i19;
                int i23 = i3 + this.h;
                int i24 = this.f332b[i22] >>> 24;
                int i25 = (this.f332b[i22] >> 16) & 255;
                int iA3 = a(this.f332b[i22]);
                int i26 = this.f332b[i22] & 255;
                int iAbs4 = iMax + (Math.abs(z.f362a.nextInt()) % (i21 - iMax));
                int i27 = 0;
                int i28 = 0;
                this.i = 0;
                this.j = 0;
                for (int i29 = 0; i29 < this.f326a.length; i29++) {
                    this.f326a[i29] = null;
                }
                if (iA3 >= 2 && i26 >= 2) {
                    for (int i30 = 0; i30 < i26; i30++) {
                        for (int i31 = 0; i31 < iA3; i31++) {
                            i28 += iArr3[i30 + i25][i31 + i24];
                        }
                    }
                    if (i28 != 0) {
                        int iMin = Math.min((iAbs4 << 1) / i28, 7);
                        int i32 = this.f325a[iMin << 1];
                        int i33 = this.f325a[(iMin << 1) + 1];
                        int iMin2 = Math.min((iAbs4 * 100) / i28, 100);
                        boolean z2 = true;
                        int i34 = 0;
                        int[] iArr4 = null;
                        if (iA3 == 2 && i26 == 4) {
                            iArr4 = this.f337c;
                        } else if (iA3 == 4 && i26 == 2) {
                            iArr4 = this.f338d;
                        } else if (iA3 == 4 && i26 == 4) {
                            iArr4 = this.f339e;
                        } else if (iA3 == 4 && i26 == 6) {
                            iArr4 = this.f342h;
                        } else if (iA3 == 6 && i26 == 2) {
                            iArr4 = this.f341g;
                        } else if (iA3 == 6 && i26 == 6) {
                            iArr4 = this.f340f;
                        } else if (iA3 == 4 && i26 == 8) {
                            iArr4 = this.f343i;
                        }
                        if (z.n != 4 && Math.abs(z.f362a.nextInt()) % 100 <= 40 && iArr4 != null) {
                            int i35 = -1;
                            int i36 = 1;
                            for (int iAbs5 = Math.abs(z.f362a.nextInt()) % iArr4[0]; iAbs5 > 0; iAbs5--) {
                                i36 = iArr4[i36 + 2];
                            }
                            for (int i37 = 0; i37 < iArr4[0]; i37++) {
                                if (z.n >= iArr4[i36 + 1]) {
                                    int iA4 = 0;
                                    for (int i38 = 0; i38 < iArr4[i36]; i38++) {
                                        Object[] objArr = new Object[2];
                                        z.a(objArr, iArr4[i36 + 3 + i38]);
                                        iA4 += a(iArr3, z.b(objArr), z.c(objArr), i24, i25, z.f(objArr), z.g(objArr));
                                    }
                                    if (iA4 < iMax || iA4 > i21) {
                                        i36 = iArr4[i36 + 2];
                                    } else {
                                        i34 = iA4;
                                        i35 = i36;
                                        if (i35 != -1) {
                                            new StringBuffer().append("").append(iA3).append("x").append(i26).append(" filled with template ").append(i35).toString();
                                            z2 = false;
                                            int iAbs6 = Math.abs(z.f362a.nextInt()) % 4;
                                            this.m = Math.abs(z.f362a.nextInt()) % 3;
                                            this.n = Math.abs(z.f362a.nextInt()) % 3;
                                            this.o = Math.abs(z.f362a.nextInt()) % 3;
                                            for (i6 = 0; i6 < iArr4[i35]; i6++) {
                                                Object[] objArr2 = new Object[2];
                                                z.a(objArr2, iArr4[i35 + 3 + i6]);
                                                iB = z.b(objArr2);
                                                int iF = z.f(objArr2);
                                                int iG = z.g(objArr2);
                                                z.e(objArr2, i24 + iF);
                                                z.f(objArr2, i25 + 3 + iG);
                                                if (iB == 3) {
                                                    i27++;
                                                }
                                                iD = z.d(objArr2);
                                                if (this.f328c && !this.f329d) {
                                                    switch (iD) {
                                                        case 0:
                                                            int i39 = this.m;
                                                            boolean z3 = !this.f344g;
                                                            this.f344g = z3;
                                                            iD = a(i39, 0, z3, iAbs6);
                                                            break;
                                                        case 1:
                                                            int i40 = this.n;
                                                            boolean z4 = !this.f345h;
                                                            this.f345h = z4;
                                                            iD = a(i40, 1, z4, iAbs6);
                                                            break;
                                                        case 2:
                                                            int i41 = this.o;
                                                            boolean z5 = !this.f346i;
                                                            this.f346i = z5;
                                                            iD = a(i41, 2, z5, iAbs6);
                                                            break;
                                                    }
                                                } else {
                                                    iD = this.e;
                                                }
                                                z.c(objArr2, iD);
                                                this.f326a[(iA3 * iG) + iF] = objArr2;
                                            }
                                        }
                                    }
                                }
                            }
                            if (i35 != -1) {
                                new StringBuffer().append("").append(iA3).append("x").append(i26).append(" filled with template ").append(i35).toString();
                                z2 = false;
                                int iAbs7 = Math.abs(z.f362a.nextInt()) % 4;
                                this.m = Math.abs(z.f362a.nextInt()) % 3;
                                this.n = Math.abs(z.f362a.nextInt()) % 3;
                                this.o = Math.abs(z.f362a.nextInt()) % 3;
                                while (i6 < iArr4[i35]) {
                                    Object[] objArr3 = new Object[2];
                                    z.a(objArr3, iArr4[i35 + 3 + i6]);
                                    iB = z.b(objArr3);
                                    int iF2 = z.f(objArr3);
                                    int iG2 = z.g(objArr3);
                                    z.e(objArr3, i24 + iF2);
                                    z.f(objArr3, i25 + 3 + iG2);
                                    if (iB == 3) {
                                        i27++;
                                    }
                                    iD = z.d(objArr3);
                                    if (this.f328c) {
                                        iD = this.e;
                                    } else {
                                        iD = this.e;
                                    }
                                    z.c(objArr3, iD);
                                    this.f326a[(iA3 * iG2) + iF2] = objArr3;
                                }
                            }
                        }
                        if (z2) {
                            for (int i42 = 0; i42 < i26; i42++) {
                                for (int i43 = 0; i43 < iA3; i43++) {
                                    int i44 = iArr3[i25 + i42][i24 + i43];
                                    if (i44 == 0) {
                                        Object[] objArr4 = new Object[2];
                                        z.m149a(objArr4);
                                        this.f326a[(iA3 * i42) + i43] = objArr4;
                                        z.a(this.f326a[(iA3 * i42) + i43], 1, 2, 6, 0, i24 + i43, i25 + 3 + i42);
                                    } else if (i34 < iAbs4 && i34 + i44 < i21 && Math.abs(z.f362a.nextInt()) % 100 <= iMin2) {
                                        int iAbs8 = Math.abs(z.f362a.nextInt()) % 100;
                                        if (iAbs8 <= i32 || z.n == 1) {
                                            i4 = 3;
                                            iAbs = (this.f328c || this.f329d) ? this.e : Math.abs(z.f362a.nextInt()) % 4;
                                            i5 = 1;
                                        } else if (iAbs8 <= i33 || z.n == 2) {
                                            i4 = 4;
                                            iAbs = 4;
                                            i5 = 2;
                                        } else {
                                            i4 = 5;
                                            iAbs = 5;
                                            i5 = 4;
                                        }
                                        Object[] objArr5 = new Object[2];
                                        z.m149a(objArr5);
                                        this.f326a[(iA3 * i42) + i43] = objArr5;
                                        z.a(this.f326a[(iA3 * i42) + i43], 1, i4, iAbs, 0, i24 + i43, i25 + 3 + i42);
                                        i34 += i5 * i44;
                                    }
                                }
                            }
                            int i45 = (((-50) * (i - this.f)) / (this.g - this.f)) + 50;
                            int i46 = (((-50) * (i - this.f)) / (2 * (this.g - this.f))) + 50;
                            int i47 = 0;
                            int i48 = 1;
                            while (i47 < i26) {
                                for (int i49 = 0; i49 < iA3; i49 += 2) {
                                    this.f333b[0] = this.f326a[(iA3 * i47) + i49];
                                    this.f333b[1] = this.f326a[(iA3 * i47) + i49 + 1];
                                    this.f333b[2] = this.f326a[(iA3 * i48) + i49];
                                    this.f333b[3] = this.f326a[(iA3 * i48) + i49 + 1];
                                    if (this.f333b[0] != null || this.f333b[1] != null || this.f333b[2] != null || this.f333b[3] != null) {
                                        boolean z6 = (this.f333b[0] != null && z.c(this.f333b[0]) == 2) || (this.f333b[1] != null && z.c(this.f333b[1]) == 2);
                                        boolean z7 = (this.f333b[2] != null && z.c(this.f333b[2]) == 2) || (this.f333b[3] != null && z.c(this.f333b[3]) == 2);
                                        boolean z8 = z6 || z7;
                                        if ((!z6 || !z7) && ((!z6 || this.f333b[2] != null || this.f333b[3] != null) && (!z7 || this.f333b[0] != null || this.f333b[1] != null))) {
                                            int iAbs9 = Math.abs(z.f362a.nextInt()) % 100;
                                            if (iAbs9 <= i45 || (z8 && iAbs9 <= i45 + i46)) {
                                                int i50 = 1;
                                                int i51 = z6 ? 1 : 0;
                                                int iAbs10 = Math.abs(z.f362a.nextInt()) % 100;
                                                if (iAbs10 <= i45 && !z8) {
                                                    i50 = 2;
                                                } else if ((iAbs10 & 1) == 1) {
                                                    i51 = z7 ? 0 : 1;
                                                }
                                                for (int i52 = 0; i52 < i50; i52++) {
                                                    boolean z9 = Math.abs(z.f362a.nextInt()) % 2 == 1;
                                                    int iAbs11 = Math.abs(z.f362a.nextInt()) % 4;
                                                    int iA5 = a(iArr3, i24, i25, i49, i47 + i52 + i51, 2, 1, this.f333b, i52 << 1);
                                                    int iB2 = b(iArr3, i24, i25, i49, i47 + i52 + i51, 2, 1);
                                                    int iMin3 = iA5 / iB2;
                                                    switch (z.n) {
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
                                                            a(i24, i25, iA3, i49, i47 + i52 + i51, 2, 1, 2, 3, (this.f328c || this.f329d) ? this.e : iAbs11);
                                                            break;
                                                        case 2:
                                                            a(i24, i25, iA3, i49, i47 + i52 + i51, 2, 1, 2, 4, 4);
                                                            break;
                                                        case 3:
                                                            a(i24, i25, iA3, i49, i47 + i52 + i51, 2, 1, 2, z9 ? 4 : 5, z9 ? 4 : 5);
                                                            break;
                                                        case 4:
                                                            a(i24, i25, iA3, i49, i47 + i52 + i51, 2, 1, 2, 5, 5);
                                                            break;
                                                    }
                                                    i34 += (iMin3 * iB2) - iA5;
                                                }
                                            } else if (!z8 && iAbs9 <= i45 + i46) {
                                                boolean z10 = Math.abs(z.f362a.nextInt()) % 2 == 1;
                                                int iAbs12 = Math.abs(z.f362a.nextInt()) % 4;
                                                int iA6 = a(iArr3, i24, i25, i49, i47, 2, 2, this.f333b, 0);
                                                int iB3 = b(iArr3, i24, i25, i49, i47, 2, 2);
                                                int iMin4 = iA6 / iB3;
                                                switch (z.n) {
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
                                                        a(i24, i25, iA3, i49, i47, 2, 2, 3, 3, (this.f328c || this.f329d) ? this.e : iAbs12);
                                                        break;
                                                    case 2:
                                                        a(i24, i25, iA3, i49, i47, 2, 2, 3, 4, 4);
                                                        break;
                                                    case 3:
                                                        a(i24, i25, iA3, i49, i47, 2, 2, 3, z10 ? 4 : 5, z10 ? 4 : 5);
                                                        break;
                                                    case 4:
                                                        a(i24, i25, iA3, i49, i47, 2, 2, 3, 5, 5);
                                                        break;
                                                }
                                                i34 += (iMin4 * iB3) - iA6;
                                                i27++;
                                            }
                                        }
                                    }
                                }
                                i47 += 2;
                                i48 += 2;
                            }
                        }
                        boolean z11 = z && this.f330e && !this.f331f;
                        boolean z12 = i27 == 0 && !this.f330e && i22 == iA - 2;
                        boolean z13 = i27 == 0 && z11 && i22 == iA - 1;
                        for (int i53 = 0; i53 < i26; i53++) {
                            for (int i54 = 0; i54 < iA3; i54++) {
                                if (z12 || z13) {
                                    for (int i55 = 0; i55 < 2; i55++) {
                                        for (int i56 = 0; i56 < 2; i56++) {
                                            Object[] objArr6 = this.f326a[(iA3 * i55) + i56];
                                            if (objArr6 != null && z.c(objArr6) != 2) {
                                                Object[][] objArr7 = z.f411a;
                                                int i57 = this.i;
                                                this.i = i57 + 1;
                                                objArr7[i23 + i57] = objArr6;
                                            }
                                            this.f326a[(iA3 * i55) + i56] = null;
                                        }
                                    }
                                    int i58 = z12 ? 1 : 6;
                                    int i59 = z12 ? 7 : 8;
                                    int i60 = (20 - i24) - 2;
                                    Object[][] objArr8 = z.f411a;
                                    int i61 = i23 + this.i;
                                    Object[] objArr9 = new Object[2];
                                    z.m149a(objArr9);
                                    objArr8[i61] = objArr9;
                                    Object[][] objArr10 = z.f411a;
                                    int i62 = this.i;
                                    this.i = i62 + 1;
                                    z.a(objArr10[i23 + i62], 3, i58, i59, 0, i60, 3 + i25);
                                    this.f330e = z12 ? true : this.f330e;
                                    this.f331f = z13 ? true : this.f331f;
                                    z12 = false;
                                    z13 = false;
                                } else {
                                    Object[] objArr11 = this.f326a[(iA3 * i53) + i54];
                                    int iC = objArr11 != null ? z.c(objArr11) : 0;
                                    if (objArr11 != null && iC != 2) {
                                        int iB4 = z.b(objArr11);
                                        int iF3 = (20 - z.f(objArr11)) - (iB4 == 1 ? 1 : 2);
                                        int iD2 = iC != 3 ? z.d(objArr11) : (z.d(objArr11) + (this.f327b ? this.e : 0)) % 4;
                                        Object[] objArr12 = new Object[2];
                                        z.a(objArr12, objArr11);
                                        z.e(objArr12, iF3);
                                        z.c(objArr12, iD2);
                                        if ((!this.f330e || (z11 && !this.f331f)) && iB4 == 3) {
                                            Object[] objArr13 = new Object[2];
                                            z.a(objArr13, objArr11);
                                            int i63 = !this.f330e ? 1 : 6;
                                            int i64 = !this.f330e ? 7 : 8;
                                            z.b(objArr13, i63);
                                            z.d(objArr13, 0);
                                            z.c(objArr13, i64);
                                            if (Math.abs(z.f362a.nextInt()) % 2 == 0) {
                                                Object[][] objArr14 = z.f411a;
                                                int i65 = this.i;
                                                this.i = i65 + 1;
                                                objArr14[i23 + i65] = objArr12;
                                                Object[][] objArr15 = z.f411a;
                                                int i66 = this.i;
                                                this.i = i66 + 1;
                                                objArr15[i23 + i66] = objArr13;
                                            } else {
                                                z.f411a[i23 + this.i] = objArr13;
                                                Object[][] objArr16 = z.f411a;
                                                int i67 = this.i;
                                                this.i = i67 + 1;
                                                z.e(objArr16[i23 + i67], iF3);
                                                Object[][] objArr17 = z.f411a;
                                                int i68 = this.i;
                                                this.i = i68 + 1;
                                                objArr17[i23 + i68] = objArr11;
                                            }
                                            if (this.f330e) {
                                                this.f331f = true;
                                            } else {
                                                this.f330e = true;
                                            }
                                        } else if (this.h + this.i < z.f471d[z.n - 1]) {
                                            Object[][] objArr18 = z.f411a;
                                            int i69 = this.i;
                                            this.i = i69 + 1;
                                            objArr18[i23 + i69] = objArr12;
                                            Object[][] objArr19 = z.f411a;
                                            int i70 = this.i;
                                            this.i = i70 + 1;
                                            objArr19[i23 + i70] = objArr11;
                                        }
                                    }
                                }
                            }
                        }
                        this.j = i34;
                    }
                }
                if (this.i > 0) {
                    this.h += this.i;
                    i18 -= this.j;
                }
            }
            int i71 = i16 - (iA2 * i20);
            i16 = i71;
            if (i71 > 0) {
                i17 = i18 / i16;
            }
        }
        int i72 = 4;
        while (i72 < (3 * this.f348j[0]) + 4) {
            Object[] objArr20 = new Object[2];
            z.m149a(objArr20);
            z.a(objArr20, this.f348j[i72], 2, 6, 0, this.f348j[i72 + 1], this.f348j[i72 + 2]);
            z.f411a[i15 + this.h + i3] = objArr20;
            i72 += 3;
            i15++;
        }
        int i73 = i15 + this.h;
        int i74 = this.h;
        int iMax2 = Math.max(0, i - i18);
        z.f410h[i2][0] = 0;
        z.f410h[i2][1] = i73;
        z.f410h[i2][2] = i74;
        z.f410h[i2][3] = 0 | (3 << 16) | 5120 | 8;
        z.f410h[i2][4] = 0;
        z.f410h[i2][5] = i10;
        z.f410h[i2][6] = iMax2;
        z.f410h[i2][7] = i3;
        return i15 + this.h;
    }

    private int a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i4 <= 2 || i5 <= 2) {
            if (i2 < i6 && i4 > 0 && i5 > 0) {
                i++;
                this.f332b[i] = a(i2, i3, Math.min(i4, i6 - i2), i5);
            }
        } else if (i4 > 8 || i5 > 8 || Math.abs(z.f362a.nextInt() % 100) <= 50) {
            int iAbs = 2 * (Math.abs(z.f362a.nextInt()) % (i4 / 2));
            int iAbs2 = 2 * (Math.abs(z.f362a.nextInt()) % (i5 / 2));
            int i7 = 0;
            while (i7 < 4) {
                i = a(i, i2 + ((i7 == 1 || i7 == 3) ? iAbs : 0), i3 + ((i7 == 2 || i7 == 3) ? iAbs2 : 0), (i7 == 0 || i7 == 2) ? iAbs : i4 - iAbs, (i7 == 0 || i7 == 1) ? iAbs2 : i5 - iAbs2, i6);
                i7++;
            }
        } else if (i2 < i6) {
            i++;
            this.f332b[i] = a(i2, i3, Math.min(i4, i6 - i2), i5);
        }
        return i;
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        for (int i11 = i5; i11 < i5 + i7; i11++) {
            for (int i12 = i4; i12 < i4 + 2; i12++) {
                this.f326a[(i3 * i11) + i12] = null;
            }
        }
        Object[] objArr = new Object[2];
        z.m149a(objArr);
        this.f326a[(i3 * i5) + i4] = objArr;
        z.a(this.f326a[(i3 * i5) + i4], i8, i9, i10, 0, i + i4, i2 + 3 + i5);
    }

    private static int a(int[][] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 1;
        int i8 = 1;
        int i9 = 1;
        switch (i) {
            case 1:
                i7 = 1;
                i8 = 1;
                break;
            case 2:
                i7 = 2;
                i8 = 1;
                break;
            case 3:
                i7 = 2;
                i8 = 2;
                break;
        }
        switch (i2) {
            case 3:
                i9 = 1;
                break;
            case 4:
                i9 = 2;
                break;
            case 5:
                i9 = 4;
                break;
        }
        return i9 * b(iArr, i3, i4, i5, i6, i7, i8);
    }

    private static int a(int[][] iArr, int i, int i2, int i3, int i4, int i5, int i6, Object[][] objArr, int i7) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i4; i10 < i4 + i6; i10++) {
            int i11 = i3;
            while (i11 < i3 + 2) {
                if (objArr[i9 + i7] != null) {
                    i8 += iArr[i10 + i2][i11 + i];
                }
                i11++;
                i9++;
            }
        }
        return i8;
    }

    private static int b(int[][] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 1;
        for (int i8 = i4; i8 < i4 + i6; i8++) {
            for (int i9 = i3; i9 < i3 + i5; i9++) {
                int i10 = iArr[i8 + i2][i9 + i];
                if (i10 > 0 && (i7 == 1 || i10 < i7)) {
                    i7 = i10;
                }
            }
        }
        return i7;
    }

    private static int a(int i, int i2, boolean z, int i3) {
        switch (i) {
            case 0:
                i2 += i3;
                break;
            case 1:
                i2 += z ? i3 : 0;
                break;
            case 2:
                i2 = Math.abs(z.f362a.nextInt());
                break;
        }
        return i2 % 4;
    }

    private static int a(int i) {
        return (i >> 8) & 255;
    }

    private static int a(int i, int i2, int i3, int i4) {
        return ((i & 255) << 24) | ((i2 & 255) << 16) | ((i3 & 255) << 8) | (i4 & 255);
    }
}

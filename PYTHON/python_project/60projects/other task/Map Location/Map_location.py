# # import folium as fo
# # map = fo.Map()
# #
# # x = fo.FeatureGroup(name='My Map')
# # x.add_child(fo.Marker(location=[27.1750,78.0422], popup='hello', icon=fo.Icon(color='green')))
# # map.add_child(x)
# # map
# # import folium package
# import folium
#
# # Map method of folium return Map object
#
# # Here we pass coordinates of Gfg
# # and starting Zoom level = 12
# my_map1 = folium.Map(location = [28.5011226, 77.4099794], zoom_start = 12 )
#
# # save method of Map object will create a map
# my_map1.save(" my_map1.html " )
# import folium package
import folium

my_map2 = folium.Map(location = [28.5011226, 77.4099794], zoom_start = 12)

# CircleMarker with radius
folium.CircleMarker(location = [28.5011226, 77.4099794], radius = 50, popup = ' FRI ').add_to(my_map2)

# save as html
my_map2.save(" my_map2.html ")
